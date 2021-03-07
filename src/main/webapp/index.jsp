<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1 align="center" class="mt-5"> ระบบคำนวณเลขฐาน </h1>
            <div class="row">
                <div class="col-md-6 mt-5">
                    <div class="card text-center text-white">
                        <div class="card-header bg-primary"><h3 align="center">เลขฐาน 10</h3></div>
                        <div class="card-body"> 

                            <form class="row g-3" action="Demo" method="post">
                                <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Base 10</label>
                                    <input class="form-control form-control-lg" type="number" name="number" aria-label=".form-control-lg example" required/>
                                </div>
                                <div class="col-12">
                                    <input type="submit" class="btn btn-primary" value="Generate"/>
                                </div>
                            </form>
                            
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="row">
                        <div class="col-md-6 mt-5">
                            <div class="card">
                                <div class="card-header"><h3 align="center">เลขฐาน 16</h3></div>
                                <div class="card-body">
                                    <h3 align="center">${hexa}</h3>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6 mt-5">
                            <div class="card">
                                <div class="card-header"><h3 align="center">เลขฐาน 8</div>
                                <div class="card-body">
                                    <h3 align="center">${octal}</h3>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12 mt-4">
                            <div class="card">
                                <div class="card-header"><h3 align="center">เลขฐาน 2</div>
                                <div class="card-body">
                                    <h1 align="center">${binary}</h1>                      
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
