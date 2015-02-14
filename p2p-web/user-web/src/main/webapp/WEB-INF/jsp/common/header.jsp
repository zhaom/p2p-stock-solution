<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include  file="head.jsp"%>
<div class="row">
    <div class="col-sm-3 col-md-6 col-lg-8">
        <ul class="nav navbar-nav  hidden-sm hidden-xs">
            <li><span class="navbar-text">官方QQ群:139139139</span></li>
        </ul>
    </div>
    <div class="col-sm-9 col-md-6 col-lg-4">
        <shiro:guest>
            <ul id="nonLoginBar" class="nav navbar-nav navbar-right navbar-sm hidden-xs">
                <li><a id="login-panel" href="http://localhost/passport/login" rel="nofollow">登录</a></li>
                <li><a id="create-account" href="http://localhost/passport/register" class="btn btn-sm" rel="nofollow">注册账户</a></li>
            </ul>
        </shiro:guest>
        <shiro:authenticated>
            <ul id="loginBar" class="nav navbar-nav navbar-right navbar-sm hidden-xs">
                <li><a id="nomeaming" href="http://localhost/i" class="btn btn-sm"> 欢迎[<shiro:principal></shiro:principal>] </a></li>
                <li><a id="logout" href="http://localhost/passport/logout" class="btn btn-sm" rel="nofollow">退出</a></li>
            </ul>
        </shiro:authenticated>
    </div>
</div>
<div class="row">
    <nav class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand hidden-sm hidden-xs" href="http://www.fanya.com">泛亚</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="hidden-sm hidden-xs"><a href="http://list.fanya.com">我要投资</a></li>
                <li class="hidden-sm hidden-xs"><a href="http://transfer.fanya.com">转让中心</a> </li>
                <li class="hidden-sm hidden-xs"><a href="http://help.fanya.com">需要帮助</a></li>
                <li class="hidden-sm hidden-xs"><a href="http://about.fanya.com">关于我们</a></li>
                <li class="dropdown hidden-md hidden-lg">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="http://www.fanya.com">
                        泛亚<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="http://list.fanya.com">我要投资</a></li>
                        <li><a href="http://i.fanya.com">我的账户</a></li>
                        <li><a href="#">我的投资</a></li>
                        <li><a href="#">我的资金</a></li>
                        <li><a href="#">充值</a></li>
                        <li><a href="#">提现</a></li>
                        <li><a href="#">我的积分</a></li>
                        <li><a href="#">我的金币</a></li>
                        <li><a href="http://help.fanya.com">需要帮助</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</div>