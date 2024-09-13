package programs.tree;


import programs.queue.LinkedQueue;

/* Implmentation using LinkedList*/
public class BinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();

        b.insertIterative(b.root, 50);
        b.insertIterative(b.root, 30);
        b.insertIterative(b.root, 70);
        b.insertIterative(b.root, 20);
        b.insertIterative(b.root, 21);
        b.insertIterative(b.root, 40);
        b.insertIterative(b.root, 39);

        b.insertIterative(b.root, 43);
        b.insertIterative(b.root, 44);

        b.insertIterative(b.root, 60);
        b.insertIterative(b.root, 80);
        b.insertIterative(b.root, 10);
        b.insertIterative(b.root, 90);
        b.insertIterative(b.root, 100);
        System.out.print( "Iterative Insertion started are as : ");
        b.inOrder(b.root);
        System.out.println();

       // b.insertRecursive(b.root , 3);
        //b.insertRecursive(b.root , 2);
        //b.insertRecursive(b.root , 1);
        System.out.print( "Recursive Insertion started are as : ");
        b.inOrder(b.root);
        System.out.println();

        System.out.println( "Check pre Order");
        b.preOrder(b.root);

        System.out.println();
        System.out.println( "Check post Order");
        b.postOrder(b.root);

        System.out.println();
        System.out.println( "Check level Order");
        b.levelOrder(b.root);

        System.out.println();
        System.out.println( "Iterative Search Number 10 :"+ (b.searchIterative(b.root,10)?"Found": "Not Found") );

        System.out.println();
        System.out.println( "Iterative Search Number 1000 :"+ (b.searchIterative(b.root,1000)?"Found": "Not Found") );


        System.out.println();
        System.out.println( "Recursive Search Number 10 :"+ (b.searchRecursive(b.root,10)?"Found": "Not Found") );

        System.out.println();
        System.out.println( "Recursive Search Number 1000 :"+ (b.searchRecursive(b.root,1000)?"Found": "Not Found") );


        b.delete(30);
        b.inOrder(b.root);
        System.out.println();
        b.preOrder(b.root);


        System.out.println( "Count of nodes"+ b.count(b.root));
        System.out.println( "Height of nodes"+ (b.height(b.root) -1));

    }


    class Node{
        int element;
        Node left;
        Node right;

        Node(int element , Node left , Node right){
            this.element =element;
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    BinarySearchTree(){
        root = null;
    }


    /*Insertion Iterative operation*/

    void insertIterative( Node rootTemp , int ele){

        Node temp = null;

        while(rootTemp != null){
            temp = rootTemp;
            if( ele == rootTemp.element){
                return;
            }else if(ele < rootTemp.element){
                rootTemp = rootTemp.left;
            }else {
                rootTemp = rootTemp.right;
            }
        }
        Node eleNode = new Node(ele, null, null);
        if(root != null ){
           if(temp != null) {
               if (ele < temp.element) {
                   temp.left = eleNode;
               } else {
                   temp.right = eleNode;
               }
           }
        }else{
            root = eleNode;
        }
    }

    /*Insertion Recursive operation*/

    Node insertRecursive( Node rootTemp , int ele) {
        if (rootTemp != null) {
            if (ele < rootTemp.element) {
                rootTemp.left = insertRecursive(rootTemp.left, ele);
            } else {
                rootTemp.right = insertRecursive(rootTemp.right, ele);
            }
        } else {
            Node n = new Node(ele, null, null);
            rootTemp = n;
        }
        return rootTemp;
    }

    /* searching*/

    boolean searchIterative( Node rootN , int key){
        Node tempRoot = rootN;

        while(tempRoot != null){
            if(key == tempRoot.element){
                return true;
            }else if(key < tempRoot.element){
                tempRoot = tempRoot.left;
            }else{
                tempRoot = tempRoot.right;
            }
        }
        return false;
    }

    boolean searchRecursive( Node rootN , int key){
        Node tempRoot = rootN;

        while(tempRoot != null){
            if(key == tempRoot.element){
                return true;
            }else if(key < tempRoot.element){
                 return searchRecursive(tempRoot.left, key);
            }else{
                return searchRecursive(tempRoot.right, key);
            }
        }
        return false;
    }

    /*deletion*/

    void delete (int ele){

        Node current = root;
        Node parent = null;

        // step 1: to find the node to delete and its parent
        while( current != null && ele != current.element){
            parent = current;
            if(ele < current.element){
                current = current.left;
            }if(ele > current.element){
                current = current.right;
            }
        }

        //
        if(current == null){
            System.out.println("Key "+ ele + " not found " );
        }

        //case 1. node to be delete is leaf node (has no children)
        if(current.left == null && current.right == null){
            if(current == root){
                root = null;
            }else{
                if(parent.left == current){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }
        }

        //case 2 node to be deleted has one child
        else if(current.left == null || current.right == null){
            Node child = (current.left != null) ? current.left : current.right;
            if(current == root){
                root = child;
            }else{
                if(current == parent.left){
                    parent.left = child;
                }else{
                    parent.right = child;
                }
            }
        }
        // case 3 node has two children
        else{
            // find the  successor (largest value in the left or smallest value ion the right subtree
            Node successorParent = current; // current is the one to be deleted
            Node successor = current.left;  // look into the left subtree any largest value

            while(successor.right != null){
                successorParent = successor;
                successor = successor.right;
            }

            // Replace the current node with the successor's key largest value
            current.element = successor.element;

            // Delete the successor (it will have at most one child, the left child)
            if (successorParent != current) {
                successorParent.right = successor.left;
            } else {
                successorParent.left = successor.left;
            }
        }
    }

  /*Count*/

  int count(Node root){
      if(root != null){
          int x = count(root.left);
          int y = count(root.right);
          return x+y+1;
      }
      return 0;
  }

    /*height*/

    int height(Node root){
        if(root != null){
            int x = height(root.left);
            int y = height(root.right);
            if(x > y){
                return x+1;
            }else{
                return y+1;
            }
        }
        return 0;
    }



    /* INORDER Traversing*/

    void inOrder(Node rootNode){
        if (rootNode != null){
            inOrder(rootNode.left);
            System.out.print(rootNode.element + " ");
            inOrder(rootNode.right);
        }
    }

    void preOrder(Node rootNode){
        if (rootNode != null){
            System.out.print(rootNode.element + " ");
            preOrder(rootNode.left);
            preOrder(rootNode.right);
        }
    }

    void postOrder(Node rootNode){
        if (rootNode != null){
            postOrder(rootNode.left);
            postOrder(rootNode.right);
            System.out.print(rootNode.element + " ");
        }
    }

    void levelOrder(Node rootNode){
        LinkedQueue lq = new LinkedQueue();
        Node t = rootNode;
        System.out.print(t.element +" ");
        lq.enqueue(rootNode);

        while(!lq.isEmpty()){
            t = (Node) lq.dequeue();

            if(t.left != null){
                System.out.print( t.left.element +" ");
                lq.enqueue(t.left);
            }

            if(t.right != null){
                System.out.print( t.right.element +" ");
                lq.enqueue(t.right);
            }



        }


    }


}
