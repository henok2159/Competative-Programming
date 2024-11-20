class Solution:
    def reverseWords(self, s: str) -> str:
        arr=s.split(' ')
        arr.reverse()
        word=''
        print(arr)
        for i in range(len(arr)):
            if arr[i].strip()!='':
                word+=arr[i]+" "
        return word.strip()