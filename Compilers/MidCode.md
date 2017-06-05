FUNCTION OutputInt:
T0 = fp[4];
END FUNCTION OutputInt
FUNCTION InputInt:
RETURN 0
END FUNCTION InputInt
FUNCTION fibonacci:
T0 = fp[8];
fp[r*8] = 0;;
RETURN r
END FUNCTION fibonacci
FUNCTION main:
fp[n*8] = 0;;
fp[f*8] = 0;;
fp[i*8] = 0;;
STARTWHILE_1;
T5 = i <= 20;
ENDWHILE_1;
T6 = i <= 20;
END FUNCTION main
