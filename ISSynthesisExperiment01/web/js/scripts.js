// // scripts.js

// // Simple client-side form handling

// document.getElementById('loginForm').addEventListener('submit', function(event) {
//     event.preventDefault();

//     const username = document.getElementById('username').value;
//     const password = document.getElementById('password').value;

//     // Dummy authentication (for demo purposes)
//     if (username === 'admin' && password === 'password') {
//         window.location.href = 'main.html';
//     } else {
//         alert('Invalid login credentials');
//     }
// });

// document.getElementById('logout')?.addEventListener('click', function(event) {
//     event.preventDefault();
//     window.location.href = 'index.html';
// });









// scripts.js

// document.getElementById('loginForm')?.addEventListener('submit', function(event) {
//     event.preventDefault();

//     const username = document.getElementById('username').value;
//     const password = document.getElementById('password').value;

//     if (username === 'admin' && password === 'password') {
//         window.location.href = 'main.html';
//     } else {
//         alert('Invalid login credentials');
//     }
// });

// document.getElementById('logout')?.addEventListener('click', function(event) {
//     event.preventDefault();
//     window.location.href = 'index.html';
// });

// document.addEventListener('DOMContentLoaded', function() {
//     const navLinks = document.querySelectorAll('nav ul li a');
//     const sections = document.querySelectorAll('main section');

//     navLinks.forEach(link => {
//         link.addEventListener('click', function(event) {
//             event.preventDefault();
//             const targetId = link.getAttribute('href').substring(1);

//             sections.forEach(section => {
//                 section.style.display = section.id === targetId ? 'block' : 'none';
//             });

//             navLinks.forEach(navLink => navLink.classList.remove('active'));
//             link.classList.add('active');
//         });
//     });

//     // Load submissions (dummy data)
//     const submissionList = document.getElementById('submissionList');
//     if (submissionList) {
//         const submissions = [
//             'Manuscript 1: Analyzing Quantum Entanglement',
//             'Manuscript 2: Advances in Machine Learning',
//             'Manuscript 3: A Study on Renewable Energy'
//         ];

//         submissions.forEach(submission => {
//             const li = document.createElement('li');
//             li.textContent = submission;
//             submissionList.appendChild(li);
//         });
//     }
// });









// scripts.js

// document.getElementById('loginForm')?.addEventListener('submit', function(event) {
//     event.preventDefault();

//     const username = document.getElementById('username').value;
//     const password = document.getElementById('password').value;

//     if (username === 'admin' && password === 'password') {
//         window.location.href = 'main.html';
//     } else {
//         alert('Invalid login credentials');
//     }
// });

// document.getElementById('logout')?.addEventListener('click', function(event) {
//     event.preventDefault();
//     window.location.href = 'index.html';
// });

// document.addEventListener('DOMContentLoaded', function() {
//     const navLinks = document.querySelectorAll('nav ul li a');
//     const sections = document.querySelectorAll('main section');

//     navLinks.forEach(link => {
//         link.addEventListener('click', function(event) {
//             event.preventDefault();
//             const targetId = link.getAttribute('href').substring(1);

//             sections.forEach(section => {
//                 section.style.display = section.id === targetId ? 'block' : 'none';
//             });

//             navLinks.forEach(navLink => navLink.classList.remove('active'));
//             link.classList.add('active');
//         });
//     });

//     // Load submissions (dummy data)
//     const submissionList = document.getElementById('submissionList');
//     if (submissionList) {
//         const submissions = [
//             'Manuscript 1: Analyzing Quantum Entanglement',
//             'Manuscript 2: Advances in Machine Learning',
//             'Manuscript 3: A Study on Renewable Energy'
//         ];

//         submissions.forEach(submission => {
//             const li = document.createElement('li');
//             li.textContent = submission;
//             submissionList.appendChild(li);
//         });
//     }
// });








document.getElementById('loginForm')?.addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Dummy authentication (for demo purposes)
    if (username === 'root' && password === 'root') {
        window.location.href = '../pages/mindex.jsp';
    } else {
        alert('Invalid login credentials');
    }
});

/*document.getElementById('logout')?.addEventListener('click', function(event) {
    event.preventDefault();
    window.location.href = '../index.jsp';
});
*/
document.addEventListener('DOMContentLoaded', function() {
    const navLinks = document.querySelectorAll('nav ul li a');
    const sections = document.querySelectorAll('main section');

    navLinks.forEach(link => {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            const targetId = link.getAttribute('href').substring(1);

            sections.forEach(section => {
                section.style.display = section.id === targetId ? 'block' : 'none';
            });

            navLinks.forEach(navLink => navLink.classList.remove('active'));
            link.classList.add('active');
        });
    });

    // Load submissions (dummy data)
    const submissionList = document.getElementById('submissionList');
    if (submissionList) {
        const submissions = [
            'Manuscript 1: Analyzing Quantum Entanglement',
            'Manuscript 2: Advances in Machine Learning',
            'Manuscript 3: A Study on Renewable Energy'
        ];

        submissions.forEach(submission => {
            const li = document.createElement('li');
            li.textContent = submission;
            submissionList.appendChild(li);
        });
    }
});
