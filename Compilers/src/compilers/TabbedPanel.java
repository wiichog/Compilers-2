package compilers;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.nio.file.*;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

class TabbedPanel extends JFrame {
	private JTextArea areaGrammar = new JTextArea(20,120);
	private JTextArea areaTest = new JTextArea(20,120);
	private JTextArea areaError = new JTextArea(20,120);
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	private String currentFile = "Untitled";
	private boolean changed = false;
	private Path file = Paths.get("ErrorLog_Syntax.log");
	private List<String> Errors;
	JPanel treePanel = new JPanel();
	JScrollPane scrollTreePanel = new JScrollPane(treePanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	public TabbedPanel(){
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/Compilers.txt"));
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		   areaGrammar.setText(everything);
		    br.close();
		} catch(Exception e) {	}
		
		
		
			add(scrollTreePanel,BorderLayout.CENTER);
			scrollTreePanel.setVisible(true);
			
			//Grammar Editor
			areaGrammar.setFont(new Font("Monospaced", Font.PLAIN, 12));
			JScrollPane scrollGrammar = new JScrollPane(areaGrammar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollGrammar, BorderLayout.CENTER);
			scrollGrammar.setVisible(true);

			//Test Editor
			areaTest.setFont(new Font("Monospaced", Font.PLAIN, 12));
			JScrollPane scrollTest = new JScrollPane(areaTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollTest, BorderLayout.CENTER);
			scrollTest.setVisible(true);

			//Error Viewr
			areaError.setFont(new Font("Monospaced", Font.PLAIN, 12));
			areaError.setEditable(false);
			JScrollPane scrollError = new JScrollPane(areaError,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollError, BorderLayout.CENTER);
			scrollError.setVisible(true);

			//Buttons

			JMenuBar JMB = new JMenuBar();
			setJMenuBar(JMB);
			JMenu file = new JMenu("File");
			JMenu edit = new JMenu("Edit");

			JMB.add(file);
			JMB.add(edit);

			file.add(Open);
			file.add(Save);
			file.add(Quit);
			file.add(SaveAs);
			file.addSeparator();

			for(int i=0; i<4; i++)
				file.getItem(i).setIcon(null);

			edit.add(Cut);
			edit.add(Copy);
			edit.add(Paste);

			edit.getItem(0).setText("Cut out");
			edit.getItem(1).setText("Copy");
			edit.getItem(2).setText("Paste");

			JToolBar tool = new JToolBar();
			add(tool,BorderLayout.NORTH);
			tool.add(Open);tool.add(Save);
			tool.addSeparator();

			JButton cut = tool.add(Cut), cop = tool.add(Copy), pas = tool.add(Paste);
			JButton antlr = tool.add(text2Tree);
			//Symbols to add
			cop.setText(null); cop.setIcon(new ImageIcon("/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/copy.gif"));
			cut.setText(null); cut.setIcon(new ImageIcon("C:/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/cut.gif"));
			pas.setText(null); pas.setIcon(new ImageIcon("/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/paste.gif"));

			Save.setEnabled(false);
			SaveAs.setEnabled(false);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack();
			areaGrammar.addKeyListener(k1);
			setTitle(currentFile);
			setVisible(true);

			JTabbedPane tabbedPane = new JTabbedPane();
			//JMB.add(tabbedPane, BorderLayout.CENTER);
			Container contentPane = getContentPane();
			contentPane.add(tabbedPane,BorderLayout.CENTER);
			tabbedPane.addTab("Grammar Editor", scrollGrammar);
			tabbedPane.addTab("Grammar Test", scrollTest);
			tabbedPane.addTab("Antlr Tree", scrollTreePanel);
			tabbedPane.addTab("Errors Tab", scrollError);
	}

	private KeyListener k1 = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			changed = true;
			Save.setEnabled(true);
			SaveAs.setEnabled(true);
		}
	};
	//Symbol to add
	Action Open = new AbstractAction("Open", new ImageIcon("/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/open.gif")) {
		public void actionPerformed(ActionEvent e) {
			saveOld();
			if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
				readInFile(dialog.getSelectedFile().getAbsolutePath());
			}
			SaveAs.setEnabled(true);
		}
	};
	//Symbol to add
	Action Save = new AbstractAction("Save", new ImageIcon("/Users/Juan Luis Garcia/Documents/MEGAsync/UVG SEPTIMO SEMESTRE/Compiladores/Compilers-2/Compilers/src/compilers/save.gif")) {
		public void actionPerformed(ActionEvent e) {
			if(!currentFile.equals("Untitled"))
				saveFile(currentFile);
			else
				saveFileAs();
		}
	};
	
	Action text2Tree = new AbstractAction("Test text"){
		public void actionPerformed(ActionEvent e){
			readToTree();
		}
	};

	Action SaveAs = new AbstractAction("Save as...") {
		public void actionPerformed(ActionEvent e) {
			saveFileAs();
		}
	};

	Action Quit = new AbstractAction("Quit") {
		public void actionPerformed(ActionEvent e) {
			saveOld();
			System.exit(0);
		}
	};

	ActionMap m = areaGrammar.getActionMap();
	Action Cut = m.get(DefaultEditorKit.cutAction);
	Action Copy = m.get(DefaultEditorKit.copyAction);
	Action Paste = m.get(DefaultEditorKit.pasteAction);

	private void saveFileAs() {
		if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
			saveFile(dialog.getSelectedFile().getAbsolutePath());
	}

	private void saveOld() {
		if(changed) {
			if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
				saveFile(currentFile);
		}
	}

	private void readInFile(String fileName) {
		try {
			FileReader r = new FileReader(fileName);
			areaGrammar.read(r,null);
			r.close();
			currentFile = fileName;
			setTitle(currentFile);
			changed = false;
		}
		catch(IOException e) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(this,"Editor can't find the file called "+fileName);
		}
	}

	private void saveFile(String fileName) {
		try {
			FileWriter w = new FileWriter(fileName);
			areaGrammar.write(w);
			w.close();
			currentFile = fileName;
			setTitle(currentFile);
			changed = false;
			Save.setEnabled(false);
		}
		catch(IOException e) {
		}
	}

	private void readToTree(){
		//ANTLR Tree
	  ANTLRInputStream input = new ANTLRInputStream(areaTest.getText());

	  CompilersLexer lexer  = new CompilersLexer(input);
	  // Add custom error handdlers.
      lexer.removeErrorListeners();
      lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

	  TokenStream tokenStream = new CommonTokenStream(lexer);

	  CompilersParser parser = new CompilersParser(tokenStream);
	  // Add custom error handdlers.
      parser.removeErrorListeners();
      parser.addErrorListener(ThrowingErrorListener.INSTANCE);

	  ParseTree tree = parser.program();

	  TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
	  viewr.setSize(700, 700);
	  treePanel.add(viewr);
	  try {
	  	Errors = Files.readAllLines(file, Charset.forName("UTF-8"));
	  	Files.deleteIfExists(file);
	  	for (int i = 0; i < Errors.size(); i++) {
	  		areaError.append("(" + (i + 1) + "): " + Errors.get(i) + "\n");
	  	}
	  }
	  catch ( IOException e ) {
	  	areaError.setText("Succes");
	  }
	  
	  CompilersEval Visitor = new CompilersEval();
	  Visitor.visit(tree);
	  System.out.println("*****************Tabla de Simbolos*************************");
	  	for (Map.Entry entry : Visitor.GlobalTable.entrySet()) {
	  		    System.out.println("Key " + entry.getKey());
	  		    Map<String,String[]> SymbolTable = Visitor.GlobalTable.get(entry.getKey());
	  		    for(Map.Entry e : SymbolTable.entrySet()){
	  		    	System.out.println("Second Key " + e.getKey() + " value " + Arrays.toString(SymbolTable.get(e.getKey())));
	  		    }
	  	   }
	  System.out.println("******************Tabla de Simbolos************************");
	  CompilersMidCode MidCode = new CompilersMidCode(Visitor.GlobalTable);
	  MidCode.visit(tree);
	   System.out.println("******************Cuadruplas************************");
	  	for (Map.Entry entry : MidCode.Methods.entrySet()) {
	  		    System.out.println("Key " + entry.getKey());
	  		    Map<String,String[]> SymbolTable = MidCode.Methods.get(entry.getKey());
	  		    for(Map.Entry e : SymbolTable.entrySet()){
	  	    	System.out.println("Second Key " + e.getKey() + " value " + Arrays.toString(SymbolTable.get(e.getKey())));
	  	    }
	  	   }
	  System.out.println("*******************Cuadruplas***********************");
	}
}
