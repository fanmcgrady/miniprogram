var flag = true;    // 标识图片是否显示
function hideImg() {
    var image = document.getElementById("test-img");
    if (flag) {
        image.style.display = "none";
        flag = false;
    } else {
        image.style.display = "";
        flag = true;
    }
}

function changeText() {
    var text = document.getElementById("test-text");
    text.innerText = "这是微信小程序第一课，很高兴认识大家";
}