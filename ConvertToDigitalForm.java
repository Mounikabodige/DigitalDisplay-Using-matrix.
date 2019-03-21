package converttodigitalform;

import java.util.Scanner;

public class ConvertToDigitalForm
{
     public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter letter or a digit: ");
       String a=sc.nextLine();
        char[] cc=a.toCharArray();
        
        if(cc.length==1) //As we have to print one character only 
        {
            for(int j=0;j<cc.length;j++)
            {
                switch (cc[j]) 
                {
                    case 'a':
                        smalla();
                        break;
                    case 'b':
                        smallb();
                        break;
                    case 'c':
                        smallc();
                        break;
                    case 'd':
                        smalld();
                        break;
                    case 'e':
                        smalle();
                        break;
                    case 'f':
                        smallf();
                        break;
                    case 'g':
                        smallg();
                        break;
                    case 'h':
                        smallh();
                        break;
                    case 'i':
                        smalli();
                        break;
                    case 'j':
                        smallj();
                        break;
                    case 'k':
                        smallk();
                        break;
                    case 'l':
                        smalll();
                        break;
                    case 'm':
                        smallm();
                        break;
                    case 'n':
                        smalln();
                        break;
                    case 'o':
                        smallo();
                        break;
                    case 'p':
                        smallp();
                        break;
                    case 'q':
                        smallq();
                        break;
                    case 'r':
                        smallr();
                        break;
                    case 's':
                        smalls();
                        break;
                    case 't':
                        smallt();
                        break;
                    case 'u':
                        smallu();
                        break;
                    case 'v':
                        smallv();
                        break;
                    case 'w':
                        smallw();
                        break;
                    case 'x':
                        smallx();
                        break;
                    case 'y':
                        smally();
                        break;
                    case 'z':
                        smallz();
                        break;
                    case 'A':
                        capA();
                        break;
                    case 'B':
                        capB();
                        break;
                    case 'C':
                        capC();
                        break;
                    case 'D':
                        capD();
                        break;
                    case 'E':
                        capE();
                        break;
                    case 'F':
                        capF();
                        break;
                    case 'G':
                        capG();
                        break;
                    case 'H':
                        capH();
                        break;
                    case 'I':
                        capI();
                        break;
                    case 'J':
                        capJ();
                        break;
                    case 'K':
                        capK();
                        break;
                    case 'L':
                        capL();
                        break;
                    case 'M':
                        capM();
                        break;
                    case 'N':
                        capN();
                        break;
                    case 'O':
                        capO();
                        break;
                    case 'P':
                        capP();
                        break;
                    case 'Q':
                        capQ();
                        break;
                    case 'R':
                        capR();
                        break;
                    case 'S':
                        capS();
                        break;
                    case 'T':
                        capT();
                        break;
                    case 'U':
                        capU();
                        break;
                    case 'V':
                        capV();
                        break;
                    case 'W':
                        capW();
                        break;
                    case 'X':
                        capX();
                        break;
                    case 'Y':
                        capY();
                        break;
                    case 'Z':
                        capZ();
                        break;
                    case '1':
                        digit1();
                        break;
                    case '2':
                        digit2();
                        break;
                    case '3':
                        digit3();
                        break;
                    case '4':
                        digit4();
                        break;
                    case '5':
                        digit5();
                        break;
                    case '6':
                        digit6();
                        break;
                    case '7':
                        digit7();
                        break;
                    case '8':
                        digit8();
                        break;
                    case '9':
                        digit9();
                        break;
                    case '0':
                        digit0();
                        break;
                    default:
                        System.out.println(" Invalid Input");
                        break;
                }
              System.out.print("");
        }
        }
        else{
            System.out.println("Please Enter one Character only");    
        }
        }
     
     
	// Function to print *
    static void print(int mat[][]) 
    {  
        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 5; j++) { 
                    if (mat[i][j] == 1){ 
                        System.out.print("*"); 
                    }
                    else
                    {
                        System.out.print(" "); 
                    }
            } 
            System.out.println(); 
        } 
    } 
     // In matrix 0 used for space 
        // and 1  for * 
    
    // Methods digit0()-digit9() for numbers
    
    static void digit0() 
    { 
        int mat[][] = { { 0, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 },
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 } }; 
        print(mat); 
    } 
    static void digit1() 
    { 
        int mat[][] = { { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    static void digit2() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 },
                        { 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    static void digit3() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    static void digit4() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    static void digit5() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 },
                        { 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    static void digit6() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 0, 1, 1 } }; 
        print(mat); 
    } 
    static void digit7() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    static void digit8() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    static void digit9() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    // Methods smalla()-smallz() for  small letters from a-z
    
      static void smalla() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 1, 1 }, 
                        { 1, 0, 0, 1, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallb() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 

    
    static void smallc() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    static void smalld() 
    { 
        int mat[][] = { { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smalle() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    static void smallf() 
    { 
        int mat[][] = { { 0, 0, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void smallg() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    static void smallh() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void smalli() 
    { 
        int mat[][] = { { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void smallj() 
    { 
        int mat[][] = { { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 0, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 0, 0 } };  
        print(mat); 
    } 
    
    
    static void smallk() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 1, 0, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void smalll() 
    { 
        int mat[][] = { { 0, 1, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 1, 1, 0 } }; 
        print(mat); 
    } 
    
    
    static void smallm() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void smalln() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallo() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallp() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void smallq() 
    { 
        int mat[][] = { { 0, 1, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0}, 
                        { 1, 1, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 1 }, 
                        { 0, 0, 1, 1, 0 }, 
                        { 0, 1, 1, 0, 0 } }; 
        print(mat); 
    } 
    
    
    
    static void smallr() 
    { 
        int mat[][] = { { 1, 0, 1, 1, 1 }, 
                        { 1, 1, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void smalls() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallt() 
    { 
        int mat[][] = { { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallu() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 1, 1 }, 
                        { 1, 1, 1, 0, 1 } }; 
        print(mat); 
    } 
    
    
    
    static void smallv() 
    { 
       int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
    
    static void smallw() 
    {
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallx() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    
    static void smally() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 0, 1 }, 
                        { 0, 0, 1, 0, 1 }, 
                        { 0, 0, 0, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void smallz() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 

        // Methods capA()-capZ() for  capital letters from A-Z
    static void capA() 
    { 
        int mat[][] = { { 0, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void capB() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void capC() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void capD() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 0 } }; 
        print(mat); 
    } 
    
    

    static void capE() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void capF() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void capG() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
 
    
    
    static void capH() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
 
    
    static void capI() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
 
    
    static void capJ() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 1, 1, 0, 0 } }; 
        print(mat); 
    } 
 
    

    static void capK() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 1, 0, 0, 0 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
 


    static void capL() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 

    

    static void capM() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void capN() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 0, 0, 1 }, 
                        { 1, 1, 0, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 0, 1, 1 }, 
                        { 1, 0, 0, 1, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 

    

    static void capO() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    

    static void capP() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 } }; 
        print(mat); 
    } 


    static void capQ() 
    { 
        int mat[][] = { { 0, 1, 1, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 0, 1, 1, 1, 0 }, 
                        { 0, 0, 0, 0, 1 } }; 
        print(mat); 
    } 


    static void capR() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 1, 0, 0 }, 
                        { 1, 0, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void capS() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 0 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
    
    
    static void capT() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
    
    
    static void capU() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
  
    
    static void capV() 
    {  
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
  
    
    static void capW() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 0, 1, 0, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 1, 0, 1, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void capX() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 } }; 
        print(mat); 
    } 
    
    
    static void capY() 
    { 
        int mat[][] = { { 1, 0, 0, 0, 1 }, 
                        { 1, 0, 0, 0, 1 }, 
                        { 0, 1, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 } }; 
        print(mat); 
    } 
    
       
    static void capZ() 
    { 
        int mat[][] = { { 1, 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0, 1 }, 
                        { 0, 0, 0, 1, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 0, 1, 0, 0 }, 
                        { 0, 1, 0, 0, 0 }, 
                        { 1, 0, 0, 0, 0 }, 
                        { 1, 1, 1, 1, 1 } }; 
        print(mat); 
    } 
   
}
