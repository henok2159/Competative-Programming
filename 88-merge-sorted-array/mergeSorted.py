class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        j=0

        while j<n:
            nums1[m+j]=nums2[j]
            j+=1
        nums1.sort()

      
