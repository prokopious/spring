# Web App for Remote Testing Practice

          This project consists of a server, a frontend, and a MySQL database.
          The server (this repo) is a Heroku Spring Boot Rest API for MySQL CRUD operations
          with an additional endpoint for remotely running headless Selenium
          tests via HtmlUnitDriver. The tests themselves are written on the
          client side (second site) and sent via POST request in the form of an
          object containing both the URL of the site we're testing and the Java
          test code itself. The code is evaluated serverside using BeanShell and
          the result is then sent back and displayed to the client.
          
> [Frontend for testing](https://ubiquitous-genie-4ee8f3.netlify.app/)





