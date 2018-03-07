/*
Write a method called shift that rearranges the elements of a list of integers by moving to the end
of the list all values that are in odd-numbered positions and otherwise preserving list order.
For example, suppose that a variable list stores the values[10, 31, 42, 23, 44, 75, 86].
The call of list.shift(); should rearrange the list to store [10, 42, 44, 86, 31, 23, 75].
It doesn’t matter whether the value itself is odd or even; what matters is whether the value
appears in an odd index (index 1, 3, 5, etc.). Also notice that the original order of the list
is other- wise preserved. You may not construct any new nodes nor use any auxiliary data
structures to solve this problem. You also may not change any data fields of the nodes;
you must solve this problem by rearranging the links of the list.
*/
public class ch16_20 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(10);
        list.add(31);
        list.add(42);
        list.add(23);
        list.add(44);
        list.add(75);
        list.add(86);
        list.shift();
        System.out.println(list);
    }

    /*
    kaldte metode:

    //meget hård opgave - endte med at google mig frem efter flere timers forsøg
    public void shift()
    {
        if(front == null)
            return;

        ListNode before = front;
        ListNode after = front.next;
        ListNode current = front;

        while(before.next != null)
        {
            current.next = before.next;
            current = before.next;
            before.next = current.next;
            if(current.next != null)
            {
                before = current.next;

                current.next = null;

            }
            else
            {
                current.next = null;
                break;
            }
        }

        if(after != null)
        {
            before.next = after;
        }
    }

    }
     */
}
