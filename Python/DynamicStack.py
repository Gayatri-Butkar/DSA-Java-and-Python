class DynamicStack:
    def __init__(self):
        self.capacity = 2
        self.stack = [None]*self.capacity
        self.top = 0

    def push(self,data):
        if self.size() == self.capacity:
            self._expand()
        self.stack[self.top] = data
        self.top+=1

    def _expand(self):
        self.capacity *= 2
        newStack = [None]*self.capacity
        for i in range(self.size()):
            newStack[i] = self.stack[i]
        self.stack = newStack

    def pop(self):
        if self.is_empty():
            print("Stack is Emmpty")
            return None
        self.top-=1
        data = self.stack[self.top]
        self.stack[self.top] = None
        return data

    def peek(self):
        if self.is_empty():
            print("Stack is Empty")
            return None
        return self.stack[self.top-1]

    def size(self):
        return self.top
    
    def is_empty(self):
        return self.top <= 0
    
    def show(self):
        print("Stack (top to bottom):", [self.stack[i] for i in range(self.top - 1, -1, -1)])


nums = DynamicStack()    
print("Empty ?", nums.is_empty()) 
nums.push(4)
nums.push(10)
nums.push(72)

print("Top Element is =", nums.peek())

nums.push(13)
nums.push(7)

print("Top Element is =", nums.peek())

nums.pop()

print("Top Element is =", nums.peek())
nums.show()   


        


