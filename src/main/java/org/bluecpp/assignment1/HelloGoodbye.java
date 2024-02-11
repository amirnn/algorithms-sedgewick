 package org.bluecpp.assignment1;

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " and "+ args [1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
    }
//    private void sayBye(String[] args) {
//     System.out.print("Bye ");
//     for (int i = args.length - 1; i >= 0; --i) {
//         if (i != 0) {
//             System.out.print(args[i] + " and ");
//         } else {
//             System.out.println(args[i] + ".");
//         }
//     }
// }
//
// private void sayHello(String[] args) {
//     System.out.print("Hello ");
//
//     for (int i = 0; i < args.length; ++i) {
//         if (i != args.length - 1) {
//             System.out.print(args[i] + " and ");
//         } else {
//             System.out.println(args[i] + ".");
//         }
//     }
// }
}