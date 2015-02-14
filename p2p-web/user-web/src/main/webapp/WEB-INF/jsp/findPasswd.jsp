<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>
<div class="row">
    <div class="col-sm-8 col-md-4 col-lg-3">
        <h3 style="text-align: center">
            重设密码
        </h3>
        <form  role="form" method="post" action="">
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-phone input-group-addon"></span>
                <input type="text" name="mobile" class="form-control" placeholder="手机号">
                <span class="input-group-addon"></span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-eye-open input-group-addon"></span>
                <input type="text" name="jcaptchaCode" class="form-control" placeholder="验证码">
                <span class="input-group-addon">
                    <a href="/getcode" class="btn btn-block btn-link">发送验证码</a>
                </span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-lock input-group-addon"></span>
                <input type="password" name="password" class="form-control" placeholder="密码">
                <span class="input-group-addon"></span>
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-block btn-primary">注册</button>
            </div>
            <div class="form-group">
                <a class="forget-password-link" href="/login" target="_self">已经注册？立即登录</a>
            </div>
        </form>
    </div>
    <div class="col-sm-4 col-md-8 col-lg-9">

    </div>
</div>
<%@include file="common/footer.jsp"%>