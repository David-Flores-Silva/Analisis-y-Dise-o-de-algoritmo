#NumberOf LongestIncreasingSubsequence.py

class Solucion:
    def lengthOfLIS(self, nums: List[int]) -> int:
        cache = [1 for _ in range(len(nums))]
        
        for nums_index in range(len(nums) - 1, -1, -1):
            for cache_item_index in range(nums_index + 1, len(nums)):
                if nums[nums_index] < nums[cache_item_index]:
                    cache[nums_index] = max(cache[nums_index], 1 + cache[cache_item_index])
                    
        return max(cache)



#Pruebas-LeetCode
#Input: nums = [0,1,0,3,2,3]
#Output: 4

#Dada una matriz de números enteros, devuelve la longitud de la subsecuencia 
#estrictamente creciente más larga. Una subsecuencia es una secuencia que se 
#puede derivar de una matriz eliminando algunos elementos o ninguno.
#sin cambiar el orden de los elementos restantes.