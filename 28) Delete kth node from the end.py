'''
Following is the structure of the Node class already defined.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
'''

def removeKthNode(head, k):
    if head.next == None:
        return None

    slow = head
    fast = head
    count = 1
    length = None

    # Determine the length of the linked list
    while fast.next and fast.next.next:
        slow = slow.next
        fast = fast.next.next
        count += 1

    # Calculate the length based on the fast pointer's position
    if fast.next == None:
        length = (count * 2) - 1
    else:
        length = count * 2

    # If k is the first node, update head and return
    if length - k == 0:
        head = head.next
        return head

    # If k is in the first half of the list
    elif count < length - k:
        while count != length - k:
            count += 1
            slow = slow.next

        # Remove the kth node
        slow.next = slow.next.next
        return head

    # If k is in the second half of the list
    else:
        slow = head
        count = 1

        while count != length - k:
            count += 1
            slow = slow.next

        # Remove the kth node
        slow.next = slow.next.next
        return head