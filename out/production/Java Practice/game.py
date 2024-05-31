import random

tries=10
Number_length=4
compNumber=[]

def generate_number():
    val=0
    while True:
        cr=random.randint(0,9)
        if val==4:
            break
        elif cr not in compNumber:
            compNumber.append(cr)
            val+=1
        else:
            continue

    return compNumber

def guess_number():
    while True:
        guessNumber=input("Guess Number : ").split(" ")
        guess=[]
        for num in guessNumber:
            if(num.isdigit()):
                guess.append(int(num))
            else:
                break

        if(len(guessNumber) != Number_length):
            print(f"you must enter {Number_length} numbers only .")
            continue
        else:
            break
    return guess

def check_Number(compNumber,guessNumber):
    dictNumber={}
    bulls=0
    cows=0
    for Number in compNumber:
        if Number not in dictNumber:
            dictNumber[Number]=0
        dictNumber[Number]+=1
    for comp,guess in zip(compNumber,guessNumber):
        if guess== comp:
            bulls+=1
            dictNumber[guess]-=1
    for comp,guess in zip(compNumber,guessNumber):
        if guess in dictNumber and dictNumber[guess]>0:
            cows+=1
            dictNumber[guess]-=1
    return bulls,cows


def NumberGuess():
    print("welcome to the COWS AND BULLS game ")
    print(f"you have to finish game in {tries} attempts only.")
    print("Numbers : 0-9 ")
    compNum=generate_number()
    for i in range(tries):
        guessNumber=guess_number()
        print(f"attempt : {i+1} over !")
        bulls,cows=check_Number(compNum,guessNumber)
        if bulls==Number_length:
            print(f"Congo you guessed number in {i+1} attempts.")
            break
        print(f"BULLS : {bulls} | COWS : {cows} ")
    else:
        print(f"\nSorry you ran out of {tries} attempts. ")
        print(f"\n the color  was {compNum}")


if _name_ == "_main_":
    NumberGuess()