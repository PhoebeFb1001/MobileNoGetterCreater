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
		System.out.println("请输入你的手机号码（以1开头，共11位数字）：");
		Scanner input=new Scanner(System.in);
		String phoneNo=input.next();
		Matcher m=p.matcher(phoneNo);
		if(m.matches()) {
			System.out.println("你输入的手机号很棒，夸你。\n能变出你的手机号的代码是：\n");
			HashSet singleNums=new HashSet();
			ArrayList singlenumsArr=new ArrayList();
			ArrayList eachNums=new ArrayList();
			Iterator it=singleNums.iterator();
			for(int i=0;i<11;i++) {
				Object singleNo=phoneNo.charAt(i);//charAt方法是返回指定位置的字符
				singleNums.add(singleNo);
				
				
			}
			String arrString="";
			for(Object obj:singleNums) {
				Object singleNoNoRep=obj;
				arrString=arrString+singleNoNoRep.toString()+",";
				Object singleNoForArr=obj;
				singlenumsArr.add(singleNoForArr);
			}
			//数组arr：
			System.out.println("int[]arr=new int[]{"+arrString.substring(0,arrString.length()-1)+"};");
			//下标
			String indexStr="";
			for(int j=0;j<11;j++) {
				Object singleNo=phoneNo.charAt(j);//charAt方法是返回指定位置的字符
				int index=singlenumsArr.indexOf(singleNo);
				indexStr=indexStr+index+""+",";
			}
			//下标arr：
			System.out.println("int[]index=new int[]{"+indexStr.substring(0,indexStr.length()-1)+"};");
			System.out.println("String tel=\"\";\n\t"+"for(int i:index){\n"+"\t\t"+"tel+=arr[i];\n\t"
					+"}\n\t"+"System.out.println(\"你的宝贝手机号是：\"+tel);");
		
		}else {
			System.out.println("说好我们要玩的是1开头的一共含11位数字的手机号嘛。不跟你玩了");
		}
	}
	public static void main(String[] args) {
		PhoneCodes pc=new PhoneCodes();
		pc.printCodes();

	}

}
