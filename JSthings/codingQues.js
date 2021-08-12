let str= "()())(())";
let c1=0, c2=0;

for(let i=0;i<str.length; i++){
    if(str.charAt(i) == '('){
        c1++;
    }
    if(str.charAt(i) == ')'){
        c2++;
    }
}


if(c1==c2)
    console.log("good");
else
console.log("bad");
