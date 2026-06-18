/*
=========================================================
SKILL SUBSCRIPTION HUB - app.js
=========================================================

Purpose:
JavaScript adds small frontend interactions.

Examples:
✔ Alerts
✔ Confirmation dialogs
✔ Form validation
✔ UI feedback

Java/Spring handles the real backend logic.
This file only improves user experience.
=========================================================
*/

// =====================================================
// APPLICATION START
// =====================================================

console.log("Skill Subscription Hub Loaded Successfully");

// =====================================================
// SHOW ALERT MESSAGE
// =====================================================

function showMessage(message) {
    alert(message);
}

// Example:
// showMessage("Registration Successful!");


// =====================================================
// CONFIRM DELETE
// =====================================================

function confirmDelete() {
    return confirm("Are you sure you want to delete this item?");
}

// Usage:
// onclick="return confirmDelete()"


// =====================================================
// CONFIRM SUBSCRIPTION
// =====================================================

function confirmSubscription(packName) {
    return confirm(
        "Do you want to subscribe to '" + packName + "'?"
    );
}

// Usage:
// onclick="return confirmSubscription('Java Mastery')"


// =====================================================
// CONFIRM LOGOUT
// =====================================================

function confirmLogout() {
    return confirm("Are you sure you want to logout?");
}

// Usage:
// onclick="return confirmLogout()"


// =====================================================
// LOGIN FORM VALIDATION
// =====================================================

function validateLoginForm() {

    let email =
        document.getElementById("email")?.value.trim();

    let password =
        document.getElementById("password")?.value.trim();

    if (!email || !password) {
        alert("Please fill all fields.");
        return false;
    }

    return true;
}


// =====================================================
// REGISTER FORM VALIDATION
// =====================================================

function validateRegisterForm() {

    let name =
        document.getElementById("name")?.value.trim();

    let email =
        document.getElementById("email")?.value.trim();

    let password =
        document.getElementById("password")?.value.trim();

    if (!name || !email || !password) {
        alert("All fields are required.");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters.");
        return false;
    }

    return true;
}


// =====================================================
// LESSON SEARCH
// =====================================================

function searchLessons() {

    let input =
        document.getElementById("searchInput");

    if (!input) return;

    let filter =
        input.value.toUpperCase();

    let cards =
        document.querySelectorAll(".card");

    cards.forEach(card => {

        let text =
            card.innerText.toUpperCase();

        if (text.indexOf(filter) > -1) {
            card.style.display = "";
        } else {
            card.style.display = "none";
        }

    });
}


// =====================================================
// AUTO HIDE SUCCESS MESSAGE
// =====================================================

window.addEventListener("load", function () {

    let success =
        document.getElementById("successMessage");

    if (success) {

        setTimeout(() => {
            success.style.display = "none";
        }, 3000);

    }

});


// =====================================================
// PASSWORD VISIBILITY TOGGLE
// =====================================================

function togglePassword(fieldId) {

    let field =
        document.getElementById(fieldId);

    if (!field) return;

    if (field.type === "password") {
        field.type = "text";
    } else {
        field.type = "password";
    }
}


// =====================================================
// CHARACTER COUNTER
// =====================================================

function updateCharCount(textAreaId, countId) {

    let textArea =
        document.getElementById(textAreaId);

    let counter =
        document.getElementById(countId);

    if (!textArea || !counter) return;

    counter.innerText =
        textArea.value.length + " characters";
}


// =====================================================
// PAGE LOADED MESSAGE
// =====================================================

window.onload = function () {

    console.log("All resources loaded.");

};


// =====================================================
// FUTURE FEATURES
// =====================================================

/*
Possible Enhancements:

1. AJAX Subscription
2. Dynamic Notifications
3. Dark Mode Toggle
4. Live Search
5. Progress Tracking
6. Toast Messages
7. Lesson Completion Tracking
8. Dashboard Statistics
*/
