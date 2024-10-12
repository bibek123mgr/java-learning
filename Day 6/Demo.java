public class Demo {
    public static void main(String[] args) {
        String str = new String("example");


        //immutable and cant modify
        String str1 = "example";
        str1.concat(" i am immutable");
        System.out.println(str1); //example

        //thread safe and mutable
        StringBuffer demoString = new StringBuffer("demo string buffer");


        //alteranitave to create string and it is mutable bot not thread safe
        StringBuilder demoString1 = new StringBuilder();
        demoString1.append("i am string builder");

        System.out.println(demoString1);
        System.out.println(str.concat(str1));
        System.out.println(demoString);
    }
}
