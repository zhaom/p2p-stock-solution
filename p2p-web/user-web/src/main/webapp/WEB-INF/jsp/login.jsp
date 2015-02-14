<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>
<div class="row">
    <div class="col-sm-4 col-md-8 col-lg-9">
    </div>
    <div class="col-sm-8 col-md-4 col-lg-3">
        <h3 style="text-align: center">
            欢迎回来
        </h3>
        <form  role="form" method="post" action="">
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-user input-group-addon"></span>
                <input type="text" name="username" class="form-control" placeholder="用户名/手机号">
                <span class="input-group-addon"></span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-lock input-group-addon"></span>
                <input type="password" name="password" class="form-control" placeholder="密码">
                <span class="input-group-addon"></span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-eye-open input-group-addon"></span>
                <input type="text" name="jcaptchaCode" class="form-control" placeholder="验证码">
                <span class="input-group-addon">
                    <img class="jcaptcha-btn jcaptcha-img" src="/passport/jcaptcha.jpg" title="点击更换验证码">
                </span>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-block btn-primary">立即登录</button>
            </div>
            <div class="form-group">
                <div class="checkbox-inline">
                    <label><input type="checkbox" name="rememberMe" ng-model="rememberMe"/>记住用户名</label>
                </div>
                <a class="forget-password-link" href="/user/password-reset" target="_self">忘记密码？</a>
            </div>
        </form>
    </div>
</div>
<%@include file="common/footer.jsp"%>