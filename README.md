Gemini 1.0 Pro API
Welcome to Gemini 1.0 Pro API! This project provides a simple endpoint /api/prompt that interacts with the Gemini 1.0 Pro LLM (Large Language Model). This endpoint allows you to ask questions or provide prompts, and the model will generate an answer based on the input.

Example Usage
To use the API, send a POST request to the /api/prompt endpoint with a JSON payload containing the question or prompt. Here's an example of how to do it:

http
Copy code
POST /api/prompt
Content-Type: application/json

{
    "question": "Give me the list of things to pack when I go on a trip to San Francisco in August"
}
The server will respond with a JSON object containing the generated answer:

json
Copy code
{
    "answer": "Here's a list of things you might want to pack for your trip to San Francisco in August:\n- Light clothing, as it can be warm during the day\n- A jacket or sweater for cooler evenings\n- Comfortable walking shoes\n- Sunscreen and sunglasses\n- A reusable water bottle\n- Any necessary travel documents (ID, tickets, etc.)\n- A camera or smartphone for capturing memories\n- Portable charger for electronic devices\n- A map or guidebook of San Francisco\n- Any specific items you need for planned activities or events"
}
Getting Started
To run this project locally, follow these steps:

Clone this repository to your local machine.
Make sure you have Java and Maven installed.
Navigate to the project directory in your terminal.
Build the project using Maven: mvn clean package.
Run the application: java -jar target/your-application-name.jar.
The server will start running on http://localhost:8080.
API Reference
POST /api/prompt
Request Body
question (string): The question or prompt you want to ask the model.
Response
answer (string): The generated answer from the model.
Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.
