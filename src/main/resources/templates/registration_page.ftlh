


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9eef2; /* Light pink */
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #ff007f; /* Pink */
            text-align: center;
            margin-top: 20px;
        }

        form {
            max-width: 300px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #ff007f; /* Pink */
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #d6006f; /* Darker pink */
        }
    </style>

</head>
<body>
<form action="/register" method="post">

    <label>
        <input name="firstname" type="text" placeholder="FIRSTNAME">
    </label>
    <label>
        <input name="lastname" type="text" placeholder="LASTNAME">
    </label>

    <label>
        <input name="username" type="text" placeholder="USERNAME">
    </label>
    <label>
        <input name="password" type="password" placeholder="PASSWORD">
    </label>


    <input type="submit" value="REGISTER">
</form>
</body>
</html>