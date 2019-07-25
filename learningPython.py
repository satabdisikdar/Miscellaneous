try:
    num1, num2 = eval(input("Enter two numbers, separated by a comma : "))
    result = num1 / num2
    print("Result is", result)
 
except ZeroDivisionError:
    print("Division by zero is error !!")
 
except SyntaxError:
    print("Comma is missing. Enter numbers separated by comma like this 1, 2")
 
except:
    print("Wrong input")
 
else:
    print("No exceptions")
 
finally:
    print("This will execute no matter what")

'''
def list_duplicates(seq):
  seen = set()
  seen_add = seen.add
  # adds all elements it doesn't know yet to seen and all other to seen_twice
  seen_twice = set( x for x in seq if x in seen or seen_add(x) )
  # turn the set into a list (as requested)
  return list( seen_twice )

a = [2, 3, 4, 2, 1, 5, 4, 1, 6, 0, 1]
print "Duplicates", list_duplicates(a)'''

