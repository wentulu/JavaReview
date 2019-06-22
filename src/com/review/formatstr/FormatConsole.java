package com.review.formatstr;
/**
 * 由于占位符%的使用使得%%才会输出%。
 * */
public class FormatConsole {

    public static void main(String[] args){

        FormatConsole console = new FormatConsole();
        console.formatBoolean(true);
        System.out.println();
        console.formatCahr('C');
        System.out.println();
        console.formateDecimal(10);
        System.out.println();
        console.formatFloat(10.99f);
        System.out.println();
        console.formatDouble(10.99);
        System.out.println();
        /*解释一下下方中的数字代表的意思，
        小数点前的代表打印所占的位置数，如果超过则会自动扩大
        小数点后的位置是在浮点数使用的用于保留几个小数位的，如果不够则补0*/
        System.out.printf("#%3d#%9s#%6.2f \n",12,"Java",12.4);
        //使用-号使得左对齐
        System.out.printf("#%-6d#%-9s#%-9.2f \n",12,"Java",12.4);

        //使用，添加分隔符
        System.out.printf("￥%,d/件\n",197896767l);
        System.out.printf("￥%,f/件\n",197896767.346);

    }


    private void formatBoolean(boolean isTrue){
        System.out.printf("The Result is %b.",isTrue);
    }

    private void formatCahr(char alpha){
        System.out.printf("The char is %c.",alpha);
    }

    private void formateDecimal(int num){
        System.out.printf("The num is %d.",num);
    }

    private void formatFloat(float f){
        System.out.printf("The float is %f",f);
    }

    private void formatDouble(double d){
        System.out.printf("The float is %f",d);
    }
}
