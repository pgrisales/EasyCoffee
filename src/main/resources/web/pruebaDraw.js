function startDragLine(e) {
    firstClick = [e.pageX, e.pageY];
    //start the loop
    intervalLoop = setInterval(function(){
        ctx.clearRect(0, 0, canvas.width, canvas.height);
       
        ctx.beginPath();
        ctx.moveTo(firstClick[0], firstClick[1]);
        ctx.lineTo(cursorX, cursorY, 6);

        ctx.strokeStyle = '#000000';
        ctx.stroke();
    },10);
}
function stopDragLine(){
    clearInterval(intervalLoop);
}

function init() {
    document.onmousemove = function(e){
        cursorX = e.pageX;
        cursorY = e.pageY;
    };
    canvas.addEventListener('mousedown', startDragLine, false);
    canvas.addEventListener('mouseup', stopDragLine, false);
}

var cursorX;
var cursorY;
var canvas = document.getElementById("canvas"); //canvas, context, other vars etc
var ctx = canvas.getContext("2d");
var firstClick = [0,0];
var intervalLoop = null;
init();

