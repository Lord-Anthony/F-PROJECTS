import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
from tkinter import filedialog
from datetime import datetime
import shutil  # Import the shutil module for file copying

def perform_backup():
    retention_limit = retention_limit_entry.get()
    backup_schedule = backup_schedule_combobox.get()
    
    if backup_schedule == "Daily":
        backup_time = daily_time_combobox.get()
    elif backup_schedule == "Weekly":
        backup_day = weekly_day_combobox.get()
        backup_time = weekly_time_combobox.get()
    elif backup_schedule == "Monthly":
        backup_month = monthly_month_entry.get()
        backup_day = monthly_day_combobox.get()
        backup_time = monthly_time_combobox.get()

    # Use file dialogs to select source file and destination folder
    source_file = filedialog.askopenfilename(title="Select File to Backup")
    destination_folder = filedialog.askdirectory(title="Select Destination Folder")

    if source_file and destination_folder:
        current_time = datetime.now().strftime("%Y%m%d%H%M")
        filename = f"backup_{current_time}.txt"
        destination_path = f"{destination_folder}/{filename}"

        # Copy the selected file to the destination folder
        try:
            shutil.copy(source_file, destination_path)
            messagebox.showinfo("Backup Status", f"Backup completed. File '{source_file}' backed up to '{destination_path}'.")
        except Exception as e:
            messagebox.showerror("Backup Error", f"An error occurred during the backup: {str(e)}")
    else:
        messagebox.showwarning("Backup Cancelled", "Backup operation cancelled. Please select a source file and destination folder.")

def show_hide_widgets(event):
    selected_schedule = backup_schedule_combobox.get()

    # Hide all widgets first
    daily_frame.grid_remove()
    weekly_frame.grid_remove()
    monthly_frame.grid_remove()

    # Show only the relevant frame
    if selected_schedule == "Daily":
        daily_frame.grid()
    elif selected_schedule == "Weekly":
        weekly_frame.grid()
    elif selected_schedule == "Monthly":
        monthly_frame.grid()

root = tk.Tk()
root.title("Backup Configuration")

# Create a style for the labels
label_style = ttk.Style()
label_style.configure("Label.TLabel", foreground="blue")

# Create a style for the frames
frame_style = ttk.Style()
frame_style.configure("TFrame", background="lightgray")

# Label for Title
title_label = ttk.Label(root, text="Acuña & Luzon", style="Label.TLabel")
title_label.grid(row=0, column=0, columnspan=2, padx=10, pady=10)

# Create a separator for better organization
separator = ttk.Separator(root, orient="horizontal")
separator.grid(row=1, column=0, columnspan=2, sticky="ew", padx=10, pady=5)

# Frame for Retention Limit and Backup Schedule
retention_frame = ttk.Frame(root, style="TFrame")
retention_frame.grid(row=2, column=0, padx=10, pady=5, sticky="w")

retention_limit_label = ttk.Label(retention_frame, text="Retention Limit (in days):")
retention_limit_label.grid(row=0, column=0)
retention_limit_entry = ttk.Entry(retention_frame)
retention_limit_entry.grid(row=0, column=1)

backup_schedule_label = ttk.Label(retention_frame, text="Backup Schedule:")
backup_schedule_label.grid(row=1, column=0)
backup_schedule_combobox = ttk.Combobox(retention_frame, values=["Select...", "Daily", "Weekly", "Monthly"])
backup_schedule_combobox.grid(row=1, column=1)
backup_schedule_combobox.bind("<<ComboboxSelected>>", show_hide_widgets)

# Frames for Daily, Weekly, and Monthly options
daily_frame = ttk.Frame(root, style="TFrame")
weekly_frame = ttk.Frame(root, style="TFrame")
monthly_frame = ttk.Frame(root, style="TFrame")

# Daily Backup
daily_time_label = ttk.Label(daily_frame, text="Backup Time (HH:MM):")
daily_time_combobox = ttk.Combobox(daily_frame, values=[f"{hour:02d}:00" for hour in range(24)])
daily_time_label.grid(row=0, column=0, padx=10, pady=5, sticky="w")
daily_time_combobox.grid(row=0, column=1, padx=10, pady=5, sticky="w")

# Weekly Backup
weekly_day_label = ttk.Label(weekly_frame, text="Select Day for Weekly Backup:")
weekly_day_combobox = ttk.Combobox(weekly_frame, values=["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"])
weekly_time_label = ttk.Label(weekly_frame, text="Backup Time (HH:MM):")
weekly_time_combobox = ttk.Combobox(weekly_frame, values=[f"{hour:02d}:00" for hour in range(24)])
weekly_day_label.grid(row=0, column=0, padx=10, pady=5, sticky="w")
weekly_day_combobox.grid(row=0, column=1, padx=10, pady=5, sticky="w")
weekly_time_label.grid(row=1, column=0, padx=10, pady=5, sticky="w")
weekly_time_combobox.grid(row=1, column=1, padx=10, pady=5, sticky="w")

# Monthly Backup
monthly_month_label = ttk.Label(monthly_frame, text="Enter Month (1-12) for Monthly Backup:")
monthly_month_entry = ttk.Entry(monthly_frame)
monthly_day_combobox = ttk.Combobox(monthly_frame, values=[str(day) for day in range(1, 32)])
monthly_time_label = ttk.Label(monthly_frame, text="Backup Time (HH:MM):")
monthly_time_combobox = ttk.Combobox(monthly_frame, values=[f"{hour:02d}:00" for hour in range(24)])
monthly_month_label.grid(row=0, column=0, padx=10, pady=5, sticky="w")
monthly_month_entry.grid(row=0, column=1, padx=10, pady=5, sticky="w")
monthly_day_combobox.grid(row=1, column=1, padx=10, pady=5, sticky="w")
monthly_day_label = ttk.Label(monthly_frame, text="Select Day of the Month for Monthly Backup:")
monthly_day_label.grid(row=1, column=0, padx=10, pady=5, sticky="w")
monthly_time_label.grid(row=2, column=0, padx=10, pady=5, sticky="w")
monthly_time_combobox.grid(row=2, column=1, padx=10, pady=5, sticky="w")

# Button to perform the backup
backup_button = ttk.Button(root, text="Perform Backup", command=perform_backup)
backup_button.grid(row=3, column=0, columnspan=2, padx=10, pady=10)

root.mainloop()
