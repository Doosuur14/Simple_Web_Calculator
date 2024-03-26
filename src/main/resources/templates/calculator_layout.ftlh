

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration page</title>

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
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        input[type="text"] {
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

        hr {
            margin-top: 20px;
            border: none;
            border-top: 1px solid #ccc;
        }

        h2 {
            color: #ff007f; /* Pink */
            margin-top: 20px;
        }

        p {
            color: #333;
            margin-bottom: 20px;
        }
    </style>



</head>
<body>
<form action="/calculate" method="post">

    <label>
        <input name="firstNumber" type="text" placeholder="FIRST NUMBER">
    </label>
    <label>
        <input name="operator" type="text" placeholder="OPERATOR">
    </label>

    <label>
        <input name="secondNumber" type="text" placeholder="SECOND NUMBER">
    </label>

    <input type="submit" value="CALCULATE">
</form>

    <hr>
<#if result??>
        <h2>Calculation Result</h2>
        <p>The result of the calculation is: ${result}</p>
</#if>
</body>
</html>