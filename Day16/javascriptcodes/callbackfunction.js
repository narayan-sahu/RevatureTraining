function doHomework(subject,callback){
// console.log("Finished my "+subject+" homework");
console.log(`Finished my ${subject} homework`);
// alertFinished();
//callback hell
callback();
}

function alertFinished(){
    console.log("Home Work Finisehd");
}

doHomework("Science",alertFinished)