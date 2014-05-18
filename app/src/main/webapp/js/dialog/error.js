function showErrorDialogTest(){
    var stackTrace = 'Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11) Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11) Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11) Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11) Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11) Exception in thread "main" java.lang.NullPointerException at javaapplication63.JavaApplication63.validate(JavaApplication63.java:41) at javaapplication63.JavaApplication63.lerVetor(JavaApplication63.java:30) at javaapplication63.JavaApplication63.main(JavaApplication63.java:11)';
    var exceptionName = 'Название и некоторый текст ошибки';
    showErrorDialog(exceptionName, stackTrace)
}
function showErrorDialog(exceptionName, stackTrace) {
    var some_html = '<h2 class="label label-danger label" style="display: block; font-size: xx-large">Возникла ошибка</h2><br />';
    some_html += '<h4 class="center-block text-center">' + exceptionName + '</h4><br />';
    if(stackTrace !== undefined){
        some_html += '<button type="button" style="margin-bottom: 10px" class="btn btn-link btn-sm center-block" onclick="showStackTrace()">Показать дополнительную информацию</button>';
        some_html += '<div id="stackTraceBlock" style="overflow-y:auto; overflow-x:auto; display: none" class="well well-sm center-block">' + stackTrace + '</div>'
    }
    bootbox.alert(some_html);
}

function showStackTrace() {
    $("#stackTraceBlock").slideToggle(200);
};