<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>
<div class="row">
    <div class="col-sm-8 col-md-4 col-lg-3">
        <h3 style="text-align: center">
            快速注册，开始投资
        </h3>
        <form  role="form" method="post" id="regForm" action="">
            <input type="hidden" name="locked">
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-user input-group-addon"></span>
                <input type="text" name="username" class="form-control" placeholder="用户名">
                <span class="input-group-addon"></span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-envelope input-group-addon"></span>
                <input type="text" name="email" class="form-control" placeholder="邮箱">
                <span class="input-group-addon"></span>
            </div>
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-earphone input-group-addon"></span>
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
            <div class="input-group form-group input-group-lg">
                <span class="glyphicon glyphicon-lock input-group-addon"></span>
                <input type="password" name="confirmPassword" class="form-control" placeholder="确认密码">
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
<script type="text/javascript">
    $(document).ready(function() {
        $('#regForm').bootstrapValidator({
            message: '这个值不合法',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    message: '用户名不合法',
                    validators: {
                        notEmpty: {
                            message: '用户名必须填写而且不能为空'
                        },
                        remote: {
                            type: 'POST',
                            url: 'remote.php',
                            message: '用户名不合法',
                            delay: 1000
                        },
                        different: {
                            field: 'password',
                            message: '用户名不能与密码相同'
                        }
                    }
                },
                email: {
                    message:'邮箱不合法',
                    validators: {
                        remote:{
                            type:'POST',
                            url:'',
                            message:'邮箱不合法',
                            delay:1000
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '密码必须填写而且不能为空'
                        },
                        identical: {
                            field: 'confirmPassword',
                            message: '密码和确认密码不一致'
                        },
                        different: {
                            field: 'username',
                            message: '密码不能和用户名相同'
                        }
                    }
                },
                confirmPassword: {
                    validators: {
                        notEmpty: {
                            message: '确认密码必须填写而且不能为空'
                        },
                        identical: {
                            field: 'password',
                            message: '密码和确认密码不一致'
                        }
                    }
                },
                mobile: {
                    validators: {
                        notEmpty: {
                            message: '手机号必须填写并且不能为空'
                        },
                        digits: {
                            message: '手机号不合法'
                        },
                        remote: {
                            type: 'POST',
                            url: 'remote.php',
                            message: '手机号不合法',
                            delay: 1000
                        }
                    }
                }
            }
        });
    });
</script>
<%@include file="common/footer.jsp"%>