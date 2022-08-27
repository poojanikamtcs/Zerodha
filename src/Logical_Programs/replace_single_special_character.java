package Logical_Programs;

public class replace_single_special_character 
{
public static void main(String[] args) {
	String name = "Poo@@ja";
	String actname = name.replace("@@","");
	System.out.println(actname);
}
}
