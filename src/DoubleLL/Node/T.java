package DoubleLL.Node;

public class T {
    Node head;
    Node tail;


    //insert start
    public void insertFirst(int data) {

        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        newNode.next.prv = newNode;
        newNode.prv = null;
        head = newNode;


    }

    public void insertLast(int data) {
        Node newNode = new Node(data);


        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = null;
        newNode.prv = tail;
        tail.next = newNode;
        tail = newNode;

    }

    public boolean binarySearch(int value) {
        Node mid = getMid();

        if (mid.data > value) {

            for (; mid != null && mid.data != value; mid = mid.prv) ;


        } else {

            for (; mid != null && mid.data != value; mid = mid.next) ;


        }
        if (mid == null) {
            return false;
        }

        if (mid.data == value) {
            return true;
        }


        return false;
    }

    public Node getMid() {
        if (isEmpty()) {
            return null;
        }
        int size = size();
        size -= 1;
        Node cur = head;
        for (int i = 0; i < size / 2; ) {
            cur = cur.next;
            i++;
        }

        return cur;
    }
    public Node getMid(Node start) {
        Node slow = start;
        Node fast = start.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void insertAfterNode(int data, int value) {
        Node cur = head;
        Node newNode = new Node(data);
        if (isEmpty()) {
            System.out.println("no node with this value " + value);
            return;
        }
        for (; cur != null && cur.data != value; cur = cur.next) ;


        if (cur == null) {

            System.out.println("no node with this value " + value);
            return;
        }
        if (cur == tail) {
            insertLast(data);

            return;
        }

        newNode.next = cur.next;
        newNode.prv = cur;
        cur.next.prv = newNode;
        cur.next = newNode;

    }


    public void insertAfterFirst(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            newNode.next = null;
            newNode.prv = head;
            head.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head.next;
        newNode.prv = head;
        head.next.prv = newNode;
        head.next = newNode;

    }

    public void inserBeforeLast(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            newNode.next = head;
            newNode.prv = null;
            head.prv = newNode;
            head = newNode;
            return;
        }
        newNode.next = tail;
        newNode.prv = tail.prv;
        tail.prv.next = newNode;
        tail.prv = newNode;

    }

    public void insertBeforeNode(int element, int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (head.data == element) {
            newNode.next = head;
            head.prv = newNode;
            head = newNode;
        } else if (tail.data == element) {
            newNode.next = tail;
            newNode.prv = tail.prv;
            tail.prv.next = newNode;
            tail.prv = newNode;
        } else {
            Node curr = head;
            while (curr != null) {
                if (curr.data == element) {
                    newNode.next = curr;
                    newNode.prv = curr.prv;
                    curr.prv.next = newNode;
                    curr.prv = newNode;
                    return;
                }
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Not found");
            }
        }
    }
    //insert end

    //Deleting start
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("the set are empty");
            return;
        }
        if (isHeadEqTail()) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prv = null;
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("the set are empty");
            return;
        }
        if (isHeadEqTail()) {
            head = tail = null;
            return;
        }
        tail.prv.next = null;
        tail = tail.prv;
    }

    public void deleteAfterNode(int value) {
        Node cur = head;
        if (isEmpty()) {
            System.out.println("the set are empty");
            return;
        }
        for (; cur != null && cur.data != value; cur = cur.next) ;

        if (cur == null) {
            System.out.println("no node with this value " + value);
            return;
        }

        if (cur.next == tail) {
            deleteLast();
            return;
        }

        if (cur == head) {
            cur.next = cur.next.next;
            cur.next.prv = head;
            return;
        }
        if (cur == tail) {
            System.out.println("no node after " + value);
            return;
        }

        if (cur.data == value) {
            cur.next = cur.next.next;
            cur.next.prv = cur;

        } else {
            System.out.println("error");
        }
    }

    public void deleteNode(int value) {
        if (isEmpty()) {
            System.out.println("set are empty");
            return;
        }
        Node cur = head;
        while (cur != null && cur.next.data != value) {

            cur = cur.next;
        }
        if (cur == null) {
            System.out.println("the number not found");
            return;
        }

        deleteAfterNode(cur.data);

    }


    public void deleteAfterFirst() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            System.out.println("There is no node after head");
        } else if (head.next == tail) {
            head.next = null;
            tail = head;
        } else {
            head.next = head.next.next;
            head.next.next.prv = head;
        }
    }

    public void deleteAllAfterFirst() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            System.out.println("Tere is no node after head");
        } else {
            head.next = null;
            tail = head;
        }
    }

    public void deleteBeforeLast() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            System.out.println("There is no node before tail");
            return;
        } else if (head.next == tail) {
            head = tail;
        } else {
            tail.prv.prv.next = tail;
            tail.prv = tail.prv.prv;
        }
    }

    public void deleteAllBeforeLast() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            System.out.println("There is no node before tail");
            return;
        } else if (head.next == tail) {
            head = tail;
        } else {
            head = tail;
        }

    }

    //Deleting end

    //display start
    public void displayList() {
        Node cur = head;

        if (isEmpty()) {
            return;
        }

        for (; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
        System.out.println();


    }

    public void displayFirst() {
        if (isEmpty()) {

            return;
        }

        System.out.println("The head are " + head.data);
    }


    public void displayTail() {

        if (isEmpty()) {

            return;
        }

        System.out.println("The Tail are " + tail.data);

    }

    public void displayCount() {
        System.out.println("the amount of nodes are " + Count());
    }

    public void displayPreSuss(int value) {
        Node cur = head;

        for (; cur != null && cur.data != value; cur = cur.next) ;

        if (cur == null) {
            System.out.println("no Node with this Value " + value);
            return;
        }


        if (cur.next != null & cur.prv != null) {
            System.out.println("the prv are " + cur.prv.data);
            System.out.println("the suss are " + cur.next.data);
            return;
        }
        if (cur.prv == null & cur.next != null) {
            System.out.println("no prv");
            System.out.println("the suss are " + cur.next.data);
            return;

        }
        if (cur.next == null & cur.prv != null) {
            System.out.println("the prv are " + cur.prv.data);
            System.out.println("no suss");
            return;
        }

        System.out.println("there is no prv or suss");

    }

    public void displayRevlist() {
        if (isEmpty()) {
            System.out.println("the set are empty");
            return;
        }
        Node cur = tail;

        for (; cur != null; cur = cur.prv) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }
    //display end

    //Traversing start
    public int Count() {
        Node cur = head;
        if (isEmpty()) {
            return 0;

        }
        int count = 0;
        for (; cur != null; cur = cur.next) {
            count++;
        }
        return count;
    }

    public void search(int element) {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else {
            Node curr = head;
            while (curr != null) {
                if (curr.next == null && curr.data != element) {
                    System.out.println("Not found element " + element);
                    return;
                } else if (curr.data == element) {
                    System.out.println("Found it");
                    return;
                }
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Not found element " + element);

            }
        }

    }


    //    Traversing end
    public void ReverseQueue() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (isHeadEqTail()) {
            System.out.println("List with only one element");
            return;
        }
        Node curr = head;
        Node prev = null;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            curr.prv = nextNode;
            prev = curr;
            curr = nextNode;
        }
        tail = head;
        head = prev;
    }


    //general methods
    boolean isEmpty() {
        return head == null;
    }

    boolean isHeadEqTail() {

        return head == tail;
    }

    public boolean validNum(int value) {
        Node cur = head;


        while (cur != null) {

            if (cur.data == value) {
                return true;
            }
            cur = cur.next;
        }


        return false;
    }


    //Recursive

    //Sum recursive method
    public int Sum() {
        int sum = 0;
        Node curr = head;
        return sum(curr, sum);
    }

    private int sum(Node curr, int sum) {
        if (curr == null) {
            return sum;
        } else {
            sum += curr.data;
        }
        return sum(curr.next, sum);
    }

    // max recursive method
    public int max() {
        Node curr = head.next;
        Node max = head;
        return Max(curr, max);
    }

    private int Max(Node curr, Node max) {
        if (curr == null) {
            return max.data;
        } else if (curr.data > max.data) {
            max = curr;
        }
        return Max(curr.next, max);
    }

    //SearchRec recursive method
    public String Searchrec(int element) {
        Node curr = head;
        String exsist = "Not found";
        return searchrec(element, curr, exsist);
    }

    private String searchrec(int element, Node curr, String n) {
        if (curr == null) {
            return n;
        } else if (curr.data == element) {
            n = "Found";
        }
        return searchrec(element, curr.next, n);
    }

    //Search5/6 for finding the numbers which are divisible by 5 and 6
    public String Search5_6() {
        Node curr = head;
        String isDivisible = "";
        return search(curr, isDivisible);
    }

    public String search(Node curr, String n) {
        if (curr == null) {
            return n;
        } else if (curr.data % 5 == 0 && curr.data % 6 == 0) {
            n += curr.data + " ";
        }
        return search(curr.next, n);
    }

    //convertLinkedListToArray
    public int[] convertLinkedListToArray() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        curr = head;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = curr.data;
            curr = curr.next;
        }
        return arr;
    }

    public int size() {
        int size = 0;
        Node cur = head;
        for (; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public int size(Node start) {
        int coun = 0;
        Node curr = start;
        while(curr != null) {
            coun++;
            curr = curr.next;
        }
        return coun;
    }


    //Sort Methods
    public void selectionSort() {
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        for (Node curr1 = head; curr1.next != null; curr1 = curr1.next) {
            for (Node curr2 = curr1.next; curr2 != null; curr2 = curr2.next) {
                if (curr1.data > curr2.data) {
                    swap(curr2, curr1);
                }
            }
        }
    }

    public void bubbleSort() {
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node curr3 = null;
        for (Node curr1 = head ; curr1.next != null ; curr1 = curr1.next) {
            for (Node curr2 = head ; curr2.next != curr3 ; curr2 = curr2.next) {
                if (curr2.data > curr2.next.data) {
                    swap(curr2.next, curr2);
                }
            }
                if(curr1 == head) {
                    curr3 = tail;
                }
                if(curr1 != head) {
                    curr3 = curr3.prv;
                }
        }
    }

    public void insertionSort() {
        Node temp = new Node();
        temp.next =head;
        head.prv =temp;

        Node cur = head.next;
        for (;cur!=null;cur = cur.next){
            int val = cur.data;
            Node j = cur.prv;
            for (;j.prv!=null&&j.data>val;j=j.prv){
                j.next.data = j.data;
            }
            j.next.data = val;
        }
        temp.next = null;
        head.prv = null;
    }

//    public void mergeSort() {
//        mergeSort(head, getMid(head), tail);
//
//    }
//
//    private void mergeSort(Node left , Node mid , Node right){
//
////        int sL = mid-left+1;
////        int sR = right-mid;
////            Node i, j, k;
////        int[] L = new int[sL];
////        T L = new T();
////        int[] R = new int[sR];
////        T R = new T();
//
//        Node tempLeft = left;
//        Node tempMid = mid;
//        Node tempRight = right;
//
//        int sizeLeft = size(tempLeft);
//        int sizeRight = size(tempRight);
//
//        Node L = tempLeft;
//        Node R = tempMid.next;
//        L.prv = null;
//
//        tempMid.next = null;
//
//        if(sizeLeft > 1) {
//            Node midLeft = getMid(L);
//            mergeSort(L, midLeft, tempMid);
//        }
//        if(sizeRight > 1) {
//            Node midRight = getMid(R);
//            mergeSort(R, midRight, tempRight);
//        }
//        merge(L, R, tempLeft);
//
//
////        System.arraycopy(arr,left,L,0,sL);
////        System.arraycopy(arr,mid+1,R,0,sR);
///*
//* the previous copying method same as this one
//*         for (int i = 0 ; i<sL;i++){
//            L[i] = arr[i+left];
//        }
//        for (int i = 0 ; i<sR;i++){
//            R[i] = arr[mid+1+i];
//        }
//* but it's more efficient
//*
//* because it's from the System class and without looping which it's O(1)
//*
//* */
//
////        Node curr1 = left;
////        for(i=head ; i!=mid ; i=i.next) {
////            L.insertLast(curr1.data);
////            curr1 = curr1.next;
////        }
////        Node curr2 = mid.next;
////        for(j=mid.next ; j!=right ; j=j.next) {
////            R.insertLast(curr2.data);
////            curr2 = curr2.next;
////        }
////        i = j = head;
////        k = left;
////
////        while (i!=mid && j!=right) {
////            if (i.data <= j.data) {
//////                list.in
////                k.data = i.data;
////                i = i.next;
////            }
////            else {
////                k.data = j.data;
////                j = j.next;
////            }
////            k = k.next;
////        }
////
////        while (i != mid) {
////            k.data = i.data;
////            i = i.next;
////            k = k.next;
////        }
////        while (j != right) {
////            k.data = j.data;
////            j = j.next;
////            k = k.next;
//        }
//
//
//
//    private void merge(Node left , Node right, Node start) {
//        Node tempLeft = left;
//        Node tempRight = right;
//        Node curr = start;
//
//        while(tempLeft != null && tempRight != null && curr != null) {
//            if(tempLeft.data <= tempRight.data) {
//                curr.data = tempLeft.data;
//                tempLeft = tempLeft.next;
//            } else {
//                curr.data = tempRight.data;
//                tempRight = tempRight.next;
//            }
//            curr = curr.next;
//        }
//
//
//        while(tempLeft != null && curr != null) {
//            curr.data = tempLeft.data;
//            tempLeft = tempLeft.next;
//            curr = curr.next;
//        }
//
//        while(tempRight != null && curr != null) {
//            curr.data = tempRight.data;
//            tempRight = tempRight.next;
//            curr = curr.next;
//        }
////        if (left != right) {
////            Node curr = head;
////            int i = 1;
////            while (i < size() / 2) {
////                curr = curr.next;
////                i++;
////            }
////            Node mid = curr;
////
////            mergeSort(list, left, mid);
////            mergeSort(list, mid.next, right);
////
////            mergeSort(list,left, mid ,right);
//        }

    public void mergeSort() {
        mergeSort(head);
    }
    private Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node l = head;
        Node h = head;
        while(h != null && h.next != null) {
            l = l.next;
            h = h.next.next;
        }
        Node mid = l;
        Node bfrMid = l.prv;
        bfrMid.next = null;
        mid.prv = null;
        Node left = mergeSort(head);
        Node right = mergeSort(mid);
        return mergeSort(left, right);
    }

    public Node mergeSort(Node a, Node b) {
        if(a == null)
            return b;
        if(b == null)
            return b;
        Node head = null;
        Node tail = null;
        Node temp = null;
        if(a.data <= b.data) {
            head = a;
            tail = a;
            a = a.next;
        } else {
            head = b;
            tail = b;
            b = b.next;
        }
        while(a != null && b != null) {
            if(a.data <= b.data) {
                tail.next = a;
                temp = tail;
                tail = a;
                tail.prv = temp;
                a = a.next;
            } else {
                tail.next = b;
                temp = tail;
                tail = b;
                tail.prv = temp;
                b = b.next;
            }
        }
        if(a == null) {
            tail.next = b;
            temp = tail;
            tail = b;
            tail.prv = temp;
        }
        if(b == null) {
            tail.next = a;
            temp = tail;
            tail = a;
            tail.prv = temp;
        }
        return head;
    }



       /*for (int i = 1 ; i<arr.length;i++){
            int val = arr[i];
            int j = i-1;
            for (; j>=0&&arr[j]>val;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = val;


        }*/




    public void quickSort() {
        quickSort(head, tail);
    }

    private void quickSort(Node l, Node h) {
        if(l != null && h != null && l != h && l.prv != h) {
            Node i = partition(l, h);
            quickSort(l, i.prv);
            quickSort(i.next, h);
        }
    }

    private Node partition(Node l, Node h) {
        int pivot = h.data;
        Node i = l.prv;

        for(Node j=l ; j!=null && j!=h ; j=j.next) {
            if(j.data < pivot) {
                i = (i==null) ? l : i.next;
                swap(i,j);
            }
        }
        i = (i == null) ? l : i.next;
        swap(i,h);
        return i;
    }

public void heapSort() {
    int size = size();
    for(int i = size / 2; i >= 0; i--) {
        heapSort(size, i);
    }
    for(int i = size; i > 0; i--) {
        swap(0, i);
        heapSort(i, 0);
    }
}

    private void heapSort(int size, int index) {
        int bigSelect = index;
        int left = 2 * index + 1;
        int right = 2 * (index + 1);

        Node curr = getNodeAtIndex(index);
        Node leftNode = (left < size) ? getNodeAtIndex(left) : null;
        Node rightNode = (right < size) ? getNodeAtIndex(right) : null;

        if (leftNode != null && leftNode.data > curr.data) {
            bigSelect = left;
        }
        if (rightNode != null && rightNode.data > curr.data) {
            bigSelect = right;
        }
        if (bigSelect != index) {
            swap(index, bigSelect);
            heapSort(size, bigSelect);
        }
    }

    private void heapRev() {
        int size = size();
        for(int i = size / 2; i >= 0; i--) {
            heapRev(size, i);
        }
        for(int i = size; i > 0; i--) {
            swap(0, i);
            heapRev(i, 0);
        }
    }

    private void heapRev(int size, int index) {
        int smallSelect = index;
        int left = 2 * index + 1;
        int right = 2 * (index + 1);

        Node curr = getNodeAtIndex(index);
        Node leftNode = (left < size) ? getNodeAtIndex(left) : null;
        Node rightNode = (right < size) ? getNodeAtIndex(right) : null;
        if (leftNode != null && leftNode.data < curr.data) {
            smallSelect = left;
        }
        if (rightNode != null && rightNode.data < curr.data) {
            smallSelect = right;
        }
        if (smallSelect != index) {
            swap(index, smallSelect);
            heapRev(size, smallSelect);
        }
    }

    private Node getNodeAtIndex(int index) {
        Node temp = head;
        for(int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return temp;
    }


        //Swap method for swapping two integers
        public void swap(int index1, int index2) {
            Node node1 = getNodeAtIndex(index1);
            Node node2 = getNodeAtIndex(index2);

            if (node1 != null && node2 != null) {
                int temp = node1.data;
                node1.data = node2.data;
                node2.data = temp;
            }
        }
        public void swap(Node a, Node b) {
            int temp = a.data;
            a.data = b.data;
            b.data = temp;
        }



    }