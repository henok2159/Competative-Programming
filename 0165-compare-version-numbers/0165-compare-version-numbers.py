class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        v1=version1.split('.')
        v2=version2.split('.')
        i=0
        j=0
        while i<len(v1) or j<len(v2):
            if i>=len(v1):
                v1.append('0')
            if j>=len(v2):
                v2.append('0')
            if int(v1[i])>int(v2[j]):
                return 1
            elif int(v1[i])<int(v2[j]):
                return -1
            i+=1
            j+=1
        return 0
        