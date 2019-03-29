package CollectionsPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCodes {
	String pattern="^1[0-9]{10}";
	Pattern p=Pattern.compile(pattern);
	public void printCodes() {
		System.out.println("����������ֻ����루��1��ͷ����11λ���֣���");
		Scanner input=new Scanner(System.in);
		String phoneNo=input.next();
		Matcher m=p.matcher(phoneNo);
		if(m.matches()) {
			System.out.println("��������ֻ��źܰ������㡣\n�ܱ������ֻ��ŵĴ����ǣ�\n");
			HashSet singleNums=new HashSet();
			ArrayList singlenumsArr=new ArrayList();
			ArrayList eachNums=new ArrayList();
			Iterator it=singleNums.iterator();
			for(int i=0;i<11;i++) {
				Object singleNo=phoneNo.charAt(i);//charAt�����Ƿ���ָ��λ�õ��ַ�
				singleNums.add(singleNo);
				
				
			}
			String arrString="";
			for(Object obj:singleNums) {
				Object singleNoNoRep=obj;
				arrString=arrString+singleNoNoRep.toString()+",";
				Object singleNoForArr=obj;
				singlenumsArr.add(singleNoForArr);
			}
			//����arr��
			System.out.println("int[]arr=new int[]{"+arrString.substring(0,arrString.length()-1)+"};");
			//�±�
			String indexStr="";
			for(int j=0;j<11;j++) {
				Object singleNo=phoneNo.charAt(j);//charAt�����Ƿ���ָ��λ�õ��ַ�
				int index=singlenumsArr.indexOf(singleNo);
				indexStr=indexStr+index+""+",";
			}
			//�±�arr��
			System.out.println("int[]index=new int[]{"+indexStr.substring(0,indexStr.length()-1)+"};");
			System.out.println("String tel=\"\";\n\t"+"for(int i:index){\n"+"\t\t"+"tel+=arr[i];\n\t"
					+"}\n\t"+"System.out.println(\"��ı����ֻ����ǣ�\"+tel);");
		
		}else {
			System.out.println("˵������Ҫ�����1��ͷ��һ����11λ���ֵ��ֻ��������������");
		}
	}
	public static void main(String[] args) {
		PhoneCodes pc=new PhoneCodes();
		pc.printCodes();

	}

}
