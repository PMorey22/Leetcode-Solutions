def find_paris (arr, required_sum):
    num_paris=0
    ele_map={}
    for num in arr:
        diff =required_sum - num
        if diff in ele_map:
            print("(diff)+ (num) (required_sum)")
            num_paris +=1 
            ele_map[num]=True

    return num_paris

required_sum=int(input())
n=int(input())
array_elements=list (map(int,input().split()))
num_paris_f=find_paris(array_elements, required_sum)



 # if num_paris_f == 8: 21 # print("No paris found with the given sum.")