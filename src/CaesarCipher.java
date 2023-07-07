import java.util.Scanner;

public class CaesarCipher {
    public static Node<String> encrypt(Node<String> head, int shift) {
        Node<String> current = head;

        while (current != null) {
            String word = current.value;

            StringBuilder encryptedWord = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (Character.isUpperCase(ch)) {
                        char shiftedCh = (char) (((ch - 'A') + shift) % 26 + 'A');
                        encryptedWord.append(shiftedCh);
                    } else {
                        char shiftedCh = (char) (((ch - 'a') + shift) % 26 + 'a');
                        encryptedWord.append(shiftedCh);
                    }
                } else {
                    encryptedWord.append(ch);
                }
            }

            current.value = encryptedWord.toString();
            current = current.next;
        }

        return head;
    }

    public static Node<String> decrypt(Node<String> head, int shift) {
        return encrypt(head, 26 - shift);
    }

    public static void printList(Node<String> head) {
        Node<String> current = head;

        while (current != null) {
            System.out.print(current.value);
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String message = scanner.nextLine();

        Node<String> headNode = null;
        Node<String> currentNode = null;

        for (char ch : message.toCharArray()) {
            Node<String> node = new Node<>(String.valueOf(ch));

            if (headNode == null) {
                headNode = node;
                currentNode = node;
            } else {
                currentNode.next = node;
                currentNode = currentNode.next;
            }
        }

        int keyShift = 3;

        System.out.print("Original Message: ");
        printList(headNode);

        Node<String> encryptedHead = encrypt(headNode, keyShift);
        System.out.print("Encrypted Message: ");
        printList(encryptedHead);

        Node<String> decryptedHead = decrypt(encryptedHead, keyShift);
        System.out.print("Decrypted Message: ");
        printList(decryptedHead);

        scanner.close();
    }
}
