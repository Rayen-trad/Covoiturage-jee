<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submit Review</title>
</head>
<body>
<h1>Submit a Review</h1>
<form action="/review" method="POST">
    <label for="rideId">Ride ID:</label>
    <input type="text" id="rideId" name="rideId" required><br><br>

    <label for="rating">Rating:</label>
    <input type="number" id="rating" name="rating" min="1" max="5" required><br><br>

    <label for="review">Review:</label>
    <textarea id="review" name="review" required></textarea><br><br>

    <input type="submit" value="Submit Review">
</form>
</body>
</html>
