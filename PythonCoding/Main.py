

def function():
    list = [5,2,2,6,7,1,2,5]
    var = 5
    var1 = 2
    
    for i in list:
        for j in list:
            temp = j[j+1]
            j = j[j+1]
            j[j+1] = temp 
    
    for i in list:
        print(i)

    

function()