
FUNCTION OutputInt:
END FUNCTION OutputInt

FUNCTION InputInt:
RETURN 0
END FUNCTION InputInt

FUNCTION fibonacci:
	t1 = fp[8]==0; 
	IF t1 > 0 GOTO LABEL_TRUE_1
	GOTO LABEL_FALSE_1
LABEL_TRUE_1:
	fp[8]=1; 
	GOTO END_IF1
	fp[8]=1; 
LABEL_FALSE_1:
	t5 = fp[8]==1; 
	IF t5 > 0 GOTO LABEL_TRUE_2
	GOTO LABEL_FALSE_2
LABEL_TRUE_2:
	fp[8]=1; 
	GOTO END_IF2
	fp[8]=1; 
LABEL_FALSE_2:
	t9 = ; 
	 PARAM t9; 
	 CALL fibonacci; 
	t11 = ; 
	 PARAM t11; 
	t12 = t11 + t9; 
	 CALL fibonacci; 
	GOTO END_IF2
	ENDIF_2
	GOTO END_IF2
	ENDIF_2
RETURN r
END FUNCTION fibonacci

FUNCTION main:
	fp[32]=0; 
STARTWHILE_1;
	t15 = fp[32]<=20; 
	IF t15 > 0 GOTO LABEL_TRUE_3
	GOTO LABEL_FALSE_3
	t16 = fp[32]; 
	 PARAM t16; 
	 CALL fibonacci; 
	t18 = int; 
	 PARAM t18; 
	t19 = t18 + t16; 
	 CALL OutputInt; 
	fp[32]=i+1; 
	GOTO ENDWHILE_1
ENDWHILE_1;
END FUNCTION main
