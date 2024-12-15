<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Ride</title>
</head>
<body>
<h1>Create a New Ride</h1>
<form action="/ride" method="POST">
    <label for="origin">Origin:</label>
    <input type="text" id="origin" name="origin" required><br><br>

    <label for="destination">Destination:</label>
    <input type="text" id="destination" name="destination" required><br><br>

    <input type="submit" value="Create Ride">
</form>
</body>
</html>
