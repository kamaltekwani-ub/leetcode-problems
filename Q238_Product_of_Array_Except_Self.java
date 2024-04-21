import java.util.Arrays;

public class Q238_Product_of_Array_Except_Self
{
    public int[] productExceptSelf(int[] nums)
    {
        int result[] = new int[nums.length];
        Arrays.fill(result, 1);

        int leftProduct = 1;
        for(int index=0 ; index<nums.length ; index++){
            result[index] *= leftProduct;
            leftProduct *= nums[index];
        }

        int rightProduct = 1;
        for(int index=nums.length-1 ; index>=0 ; index--){
            result[index] *= rightProduct;
            rightProduct *= nums[index];
        }

        return result;
    }
}
