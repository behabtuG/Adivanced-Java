package Strings.StringBuffer.deleteCharAt;

// Java program to demonstrate working
// of StringBuffer.deleteCharAt() method

public class DeleteCharAt {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Behabtu");
        System.out.println("String buffer before deletion = " + sbf);

        // Deleting the character at indexpoint 5
        sbf.deleteCharAt(5);
        System.out.println("After deletion new StringBuffer = " + sbf);
    }

    //output:
    //String buffer before deletion = Behabtu
    //After deletion new StringBuffer = Behabu
}
