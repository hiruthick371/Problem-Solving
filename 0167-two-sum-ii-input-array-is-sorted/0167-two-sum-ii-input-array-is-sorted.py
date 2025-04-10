class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        left = 0
        right = len(nums)-1
        ans=[]
        while(left<right):
            if(nums[left] + nums[right] == target):
                ans.append(left+1)
                ans.append(right+1)
                break
            elif(nums[left] + nums[right] > target):
                right-=1
            else:
                left+=1
        return ans


   
        