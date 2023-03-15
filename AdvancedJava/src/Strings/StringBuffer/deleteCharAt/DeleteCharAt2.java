package Strings.StringBuffer.deleteCharAt;

// Java program to demonstrate working
// of StringBuffer.deleteCharAt() method
public class DeleteCharAt2 {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Kidest");
        System.out.println("String buffer before deletion = " + sbf);

        // Deleting the character at indexpoint -5
        sbf.deleteCharAt(-5);
        System.out.println("After deletion new StringBuffer = " + sbf);
    }

    //output:
    //String buffer before deletion = Kidest
    //Exception in thread "main" java.lang.StringIndexOutOfBoundsExcept ion: index -5, length 6
    //	at java.base/java.lang.String.checkIndex(String.java:4563)
    //	at java.base/java.lang.AbstractStringBuilder.deleteCharAt(AbstractStringBuilder.java:970)
    //	at java.base/java.lang.StringBuffer.deleteCharAt(StringBuffer.java:486)
    //	at Strings.StringBuffer.deleteCharAt.DeleteCharAt2.main(DeleteCharAt2.java:13)
}
