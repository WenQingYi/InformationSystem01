document.getElementById('submissionForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = new FormData(this);

    fetch('your-backend-url', {
        method: 'POST',
        body: formData
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById('message').innerText = '提交成功！';
            this.reset();
        })
        .catch(error => {
            document.getElementById('message').innerText = '提交失败，请重试。';
        });
});
