document.addEventListener('DOMContentLoaded', () => {
    const apologizeButton = document.getElementById('apologizeButton');
    const sorryMessage = document.getElementById('sorryMessage');

    apologizeButton.addEventListener('click', () => {
        sorryMessage.classList.remove('hidden');
        sorryMessage.style.opacity = 1;
    });
});
