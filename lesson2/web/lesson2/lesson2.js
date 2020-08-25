function changeText() {
    var text = document.getElementById("number-text");
    // text.innerText = "藏大你好";
    text.innerHTML = "<span style='color:red'>藏大你好</span>";
}

function sendMsg() {
    // var inputArray = document.getElementsByTagName("input");
    // alert("意见是：" + inputArray[0].value + "-" + inputArray[1].value);

    // // 获取学号
    var number = document.getElementById("number").value;
    if (number == "") {
        alert("请输入学号");
        return;
    }
    // 获取意见
    var message = document.getElementById("message").value;
    if (message == "") {
        alert("请输入意见");
        return;
    }

    alert("意见是：" + number + "-" + message);
}