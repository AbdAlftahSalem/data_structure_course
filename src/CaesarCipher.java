import java.util.Scanner;

class ListNode<T> {
    T value;
    ListNode<T> next;

    public ListNode(T value) {
        this.value = value;
        this.next = null;
    }
}

public class CaesarCipher {
    public static ListNode<String> encrypt(ListNode<String> head, int shift) {
        ListNode<String> current = head;

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

    public static ListNode<String> decrypt(ListNode<String> head, int shift) {
        return encrypt(head, 26 - shift);
    }

    public static void printList(ListNode<String> head) {
        ListNode<String> current = head;

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

        ListNode<String> headNode = null;
        ListNode<String> currentNode = null;

        for (char ch : message.toCharArray()) {
            ListNode<String> node = new ListNode<>(String.valueOf(ch));

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

        ListNode<String> encryptedHead = encrypt(headNode, keyShift);
        System.out.print("Encrypted Message: ");
        printList(encryptedHead);

        ListNode<String> decryptedHead = decrypt(encryptedHead, keyShift);
        System.out.print("Decrypted Message: ");
        printList(decryptedHead);

        scanner.close();
    }
}
