<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration Page</title>
    <link href="css_files/reg.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  </head>
  <body>

 
    <section class="h-100 bg-dark">

    <form action="registerserv" method="post">
          
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col">
              <div class="card card-registration my-4">
                <div class="row g-0">
                  <div class="col-xl-6 d-none d-xl-block">
                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                      alt="Sample photo" class="img-fluid"
                      style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
                  </div>
                  <div class="col-xl-6">
                    <div class="card-body p-md-5 text-black">
                      <h3 class="mb-5 text-uppercase">Student registration form</h3>
      					
                      <div class="row">
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input name="fname" type="text" id="form3Example1m" class="form-control form-control-lg" />
                            <label class="form-label" for="form3Example1m">First name</label>
                          </div>
                        </div>
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input name="l_name" type="text" id="form3Example1n" class="form-control form-control-lg" />
                            <label class="form-label" for="form3Example1n">Last name</label>
                          </div>
                        </div>
                      </div>
      
                      <div class="row">
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input name="mother_name" type="text" id="form3Example1m1" class="form-control form-control-lg" />
                            <label class="form-label" for="form3Example1m1">Mother's name</label>
                          </div>
                        </div>
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input name="father_name" type="text" id="form3Example1n1" class="form-control form-control-lg" />
                            <label class="form-label" for="form3Example1n1">Father's name</label>
                          </div>
                        </div>
                      </div>
      
                      <div class="form-outline mb-4">
                        <input name="address" type="text" id="form3Example8" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example8">Address</label>
                      </div>
      
                      <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
      
                        <h6 class="mb-0 me-4">Gender: </h6>
      
                        <div class="form-check form-check-inline mb-0 me-4">
                          <input name="gender" class="form-check-input" type="radio" name="inlineRadioOptions" id="femaleGender"
                            value="option1" />
                          <label class="form-check-label" for="femaleGender">Female</label>
                        </div>
      
                        <div class="form-check form-check-inline mb-0 me-4">
                          <input name="gender" class="form-check-input" type="radio" name="inlineRadioOptions" id="maleGender"
                            value="option2" />
                          <label class="form-check-label" for="maleGender">Male</label>
                        </div>
      
                        <div class="form-check form-check-inline mb-0">
                          <input name="gender" class="form-check-input" type="radio" name="inlineRadioOptions" id="otherGender"
                            value="option3" />
                          <label class="form-check-label" for="otherGender">Other</label>
                        </div>
      
                      </div>
      
                      <div class="row">
                        <div class="col-md-6 mb-4">
      
                          <select name="state" class="select">
                            <option value="1">State</option>
                            <option value="2">Delhi</option>
                            <option value="3">Gujarat</option>
                            <option value="4">Rajasthan</option>
                          </select>
      
                        </div>
                        <div class="col-md-6 mb-4">
      
                          <select name="city" class="select">
                            <option value="1">City</option>
                            <option value="2">Ahmedabad</option>
                            <option value="3">Delhi NCR</option>
                            <option value="4">Jaipur</option>
                          </select>
      
                        </div>
                      </div>
      
                      <div  class="form-outline mb-4">
                        <input name="dob" type="date" id="form3Example9" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example9">Date Of Birth</label>
                      </div>
      
                      <div class="form-outline mb-4">
                        <input name="pincode" type="number" id="form3Example90" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example90">Pincode</label>
                      </div>
      
                      <div class="form-outline mb-4">
                        <input name="course" type="text" id="form3Example99" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example99">Course</label>
                      </div>
      
                      <div class="form-outline mb-4">
                        <input name="email" type="text" id="form3Example97" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example97">Email ID</label>
                      </div>
                      
                       <div class="form-outline mb-4">
                        <input name="password" type="password" id="form3Example97" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example97">Password</label>
                      </div>
      
                      <div class="d-flex justify-content-end pt-3">
                        <input type="reset" class="btn btn-light btn-lg">
                        <input type="submit" class="btn btn-warning btn-lg ms-2">
                      </div>
      
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
    
          </form>
          
      </section>
      
    


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>