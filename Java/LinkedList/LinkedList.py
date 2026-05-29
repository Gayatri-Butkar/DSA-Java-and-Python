from operator import index


class Node:
    def __init__(self,data):
        self.data = data;
        self.next = None;

class LinkedList:
    def __init__(self):
        self.head=None

    def insert(self,data):
        node = Node(data)

        if self.head is None:
            self.head = node

        else:
            n = self.head
            while n.next is not None:
                n = n.next
            n.next = node
    

    def insertAtStart(self,data):
        node = Node(data)
        node.next = self.head
        self.head = node

    def insertAt(self, data, index):
        node = Node(data)         
                        
                            
        n = self.head
        for i in range(index - 1):
           n = n.next

           node.next = n.next        
           n.next = node              

           
    def deleteAt(self,index):
        if(index==0):
            self.head = self.head.next
        else:
            n = self.head
            for i in range(index - 1):
                n = n.next
            n.next = n.next.next


    def show(self):
        node = self.head

        while node is not None:
            print(node.data)
            node = node.next 

lst = LinkedList()
lst.insert(5)
lst.insert(10)
lst.insert(15)  
lst.insertAtStart(40)
lst.insertAt(25,2)      
lst.insertAt(35,0)                    
lst.show()
