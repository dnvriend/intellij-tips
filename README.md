# intellij-tips
A small study project on how to use IntelliJ effectively.

## OSX Shortcuts

| Shortcut          | Description     |
| ----------------- | --------------- |
| CTRL + UP         | Show all desktops (OSX) |
| CTRL + RIGHT/LEFT | Switch desktop (OSX) |
| CTRL + DOWN       | Show all windows of current active application |
| CMD + SHIFT + 3/4 | Take screenshot (OSX) |
| FN + UP/DOWN      | Page up / down (OSX) |
| FN + LEFT/RIGHT   | Home/End (OSX) |

## OSX Searchlight Shortcuts

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + SPACE | Open Spotlight |
| CMD + ALT + SPACE | Open Spotlight in Finder |
| Enter | Open search item |
| CMD + Enter | Open to location of search item in Finder |
| UP/DOWN | Navigate search results |
| CMD + UP/DOWN | Jump categories in search results |
| hold CMD | Show path/location |
| CMD + i | Get Info on search item |

## Vi Shortcuts
For Vim tips and tricks see [this](https://www.cs.oberlin.edu/~kuperman/help/vim/home.html) page.

## Vi Help
The most import thing to learn about in vim is:

```bash
:help
```

and

```bash
:help command
```

- TAB - cycles through possible command completions
- CTRL-d - lists possible command completions

For example, try:

```bash
:help tags (then CTRL-d and TAB)
```

Do 'help i_ CTRL-d' for insert commands, 'v_' for visual, etc.

Also, when in the help pages, 'CTRL-]' jumps to subjects between |bars| and 'CTRL-T' jumps back (and, of course, ':q' to quit).

## Selecting Text

| Shortcut          | Description     |
| ----------------- | --------------- |
| V | selects entire line |
| v | selects range of text |
| ctrl + v | selects columns |

## Copying/Deleting Text

After selecting the text, type 'd' to delete or
'y' to copy, you can then set the cursor anywhere and type
'p' to paste the selected text. 

## File Explorer
Vim features a [file explorer](http://vim.wikia.com/wiki/File_explorer) that can be
activated when typing ':Explore'. You can switch to/from the file explorer with the
'CTRL + 6' shortcut. 

There are some other approaches for browsing files, for example:

- type ':e' then press Space and 'Ctrl + DD'. That will list file names in the current directory. You can type a name and press Enter to edit that file.
- type ':set autochdir' to automatically change the working directory to the file that you edit, so that its easy to get other files in the same dir without navigating.
- type ':e **/*.scala' and repeatedly pressing TAB to step through the files that have been found. 

## Vi Multiple Windows
If you want, you can probably do everything from one vim session! :) Here are some commands to turn one vim session (inside one xterm) into multiple windows.


| Shortcut          | Description     |
| ----------------- | --------------- |
| :e filename | edit another file |
| :split filename  | split window and load another file |
| ctrl-w up arrow | move cursor up a window |
| ctrl-w ctrl-w    | move cursor to another window (cycle) |
| ctrl-w_ |         | maximize current window |
| ctrl-w= |         | make all equal size |
| :vsplit file |    | vertical split |
| :sview file |      | same as split, but readonly |
| :hide  |          | close current window |
| :only |           | keep only this window open |

## Google Chrome Shortcuts

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + SHIFT + B | Show/hide shortcuts |
| CMD + SHIFT + F | Show/hide navigation bar |
| CMD + ALT + I | Show/hide developer tools |
| CTRL + CMD + F | Toggle full screen |

## ITerm Shortcuts
Shortcuts for the [iterm terminal emulator](https://www.iterm2.com/)

| Shortcut          | Description     |
| ----------------- | --------------- |
| CTRL + L | Clear Screen |
| CTRL + D | Exit terminal |
| CMD + D | Open a new terminal and split the screen vertically |
| CMD + SHIFT + D | Open a new terminal and split the screen horizontally |
| CMD + ] | Next terminal |
| CMD + [ | Previous terminal |
| CMD + f | Search |
| CMD + (+) | Increase font size |
| CMD + (-) | Decrease font size |

## VLC Shortcuts
Shortcuts for the [VLC media player](http://www.videolan.org/)

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + UP | Increase volume |
| CMD + DOWN | Lower volume |
| CMD + ALT + RIGHT | Step +10 seconds |
| CMD + ALT + LEFT | Step -10 seconds |
| CMD + J | Jump to time |
| SPACE / CMD + P | Pause / Play |

## Reveal.js Shortcuts
Shortcuts for [reveal.js](https://github.com/hakimel/reveal.js)

| Shortcut          | Description     |
| ----------------- | --------------- |
| Up, Down, Left, Right | Navigation |
| f | Full-screen |
| s | Show slide notes |
| o | Toggle overview |
| . (Period or b) | Turn screen black |
| Esc | Escape from full-screen, or toggle overview |

## Deckset Shortcuts
Shortcuts for [Deckset](https://www.decksetapp.com/)
which are also available [here](https://docs.decksetapp.com/English.lproj/02-keyboard-shortcuts.html)

| Shortcut          | Description     |
| ----------------- | --------------- |
| ALT + CMD + P | Enter Presentation Mode |
| ALT + CMD + R | Enter Rehearsal Mode |
| LEFT / RIGHT | Tab through slides	|
| x | Switch presenter display in Presentation Mode	|
| b | Display a black screen in Presentation Mode |

## My IntelliJ keyboard mapping
I'm using Keymap #3 which is 'Mac OSX'.

## IntelliJ Info/Help/Documentation

| Shortcut          | Description     |
| ----------------- | --------------- |
| HELP -> Keymap Reference | Keyboard shortcuts (put on other desktop and switch) |
| HELP -> Productivity Guide | Shows what features you use most often |
| ALT + ENTER | Show Intention Actions |
| CMD + F1 | Error Description (when caret is over red line in code |
| CMD + P | Parameter Info |
| CTRL + J | Quick Documentation |
| CMD + SHIFT + D | Search in Dash |

## Selecting

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + A | Select All |
| CMD + W | Extend Selection |
| CMD + SHIFT + W | Shrink Selection |
| CTRL + G | Add Selection for Next Occurrence |

## Copy/Paste

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + C | Copy |
| CMD + V | Paste |
| SHIFT + CMD + V | Clipboard History |

## Editing

| Shortcut          | Description     |
| ----------------- | --------------- |
| ALT + ENTER | Show Intention Actions |
| Double ALT + UP/DOWN | Multiple Carets |
| CMD + D | Duplicate Line |
| CMD + Y | Delete Line |
| CMD + I | Implement Members |
| CMD + O | Override Members |
| ALT + CMD + T | Surround with |
| CMD + SHIFT + UP/DOWN | Move selected block up/down |
| FN + CMD + UP/DOWN | Move caret to top/bottom |

## Searching

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + SHIFT + A   | Find action |
| Double SHIFT | Search Everywhere |
| CMD + N | Go to Class |
| CMD + SHIFT + N | Go to File |
| CMD + E | Recent Files |
| CMD + SHIFT + E | Recently Edited Files |
| CMD + F | Find |
| CMD + R | Replace |

## Navigation

| Shortcut          | Description     |
| ----------------- | --------------- |
| Double Shift | Search everywhere (use this) |
| CMD + N | Go to Class |
| SHIFT + CMD + N | Go to File |
| ALT + SHIFT + CMD + N | Go to symbol |
| CMD + SHIFT + (+/-) | Expand/Collapse All |
| CMD + (+/-) | Expand/Collapse |
| CMD + E | Recent Files |
| CMD + SHIFT + E | Recently Edited Files |
| CMD + G | Goto Line/Column |
| CMD + B | Navigate to declaration (apply on type) |
| ALT + CMD + B | Navigate to implementation |
| FN + ALT + LEFT | Toggle Navigation Bar |

## Structure

| Shortcut          | Description     |
| ----------------- | --------------- |
| CTRL + H | Type Hierarchy |
| CTRL + I | Implicit Conversion (I changed it from (CTRL + Q) for obvious reasons) |

## Save

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + S | Save All |

## Tool Windows

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + 1 | Toggle project Window |
| CMD + 7 | Toggle Structure Window |
| CMD + 9 | Toggle VCS Window |
| ALT + F1 | Select current target in Window (like say Finder, VCS or Project) |
| ALT + F12 | Toggle Terminal Window |
| SHIFT + CMD + F12 | Hide All Windows |

## Settings/Configuration/Preferences

| Shortcut          | Description     |
| ----------------- | --------------- |
| CMD + , | Open Settings/Preferences Dialog |

## Recent Files
(CMD + E) and (SHIFT + CMD + E) are really great to quickly navigate your recently edited files. Just select
a recently edited file (ENTER) and you can start editing. Its also a great way to toggle between two files that
you want to edit.

These dialogs have filter options so you can start typing and the dialog will be filtered. You can also use the (TAB)
key to switch between the sections. Another cool thing is that the dialogs give access to all the tool windows like the project windows,
the structure window and so on. You can enable all of them using this window. You can always use (SHIFT + CMD + F12)
to hide all windows which is great.

## Double Shift
'Double Shift' or 'Search Everywhere' is the goto search feature of IntelliJ. Its great because it searches through
classes, files, symbols and actions. Its also easy to navigate because you can use the following keys:

- TAB: switches between sections
- LEFT Arrow: navigate through history

## Navigation Bar
You don't really need the navigation bar, just switch it off (CMD + SHIFT + A -> navigation bar -> toggle).
Now that its off you have more real-estate, and you can invoke it with (FN + ALT + LEFT)

When you've invoked the navigation bar (FN + ALT + LEFT), you can do the following:

- ESCAPE: closes the navigation bar
- LEFT/RIGHT/UP/DOWN: navigate through the folders
- ENTER: Enter a folder or Open a file

You can also start typing, for example the name of a file and that filters the files in the current selected folder.

## Disable Tabs
Tabs are very inefficient for navigation, you get a lot of tabs, and most of the time the tab you need isn't in view.
Its better to use (CMD + E) and (CMD + SHIFT + E) and a lot faster too. You can 'switch off' tabs with
(CMD + SHIFT + A -> tab placement -> toggle None). The default setting is Tab placement top, so you
can always enable tabs when you're not ready to learn the more efficient workflow.

The advantages: you're getting rid of the mouse in your editing workflow, which is always more efficient.
The downsides: you have to learn the keyboard shortcuts so (Double Shift, CMD + E, CMD + SHIFT + E and FN + ALT + LEFT).

## Disable line numbers
You really don't need to see the line numbers all of the time. You can disable line numbers with:
(CMD + SHIFT + A -> show line numbers -> toggle). If you really need to go to a line number do the following:

- Double Shift -> search for a class eg. 'Foo' and if you need to go to line 2 type: 'Foo:2', and the editor opens
and the carrot is at line 2.
- CMD + G: If the file is already selected, just type CMD + G and type the line number.

## How to you edit code in IntelliJ
Very simple really do the following:

- Disable the navigation bar (CMD + SHIFT + A -> navigation bar -> toggle),
- Disable line numbers (CMD + SHIFT + A -> show line numbers -> toggle),
- Disable tabs (CMD + SHIFT + A -> tab placement none -> toggle),
- Toggle distraction free mode (CMD + SHIFT + A -> toggle distraction free mode -> toggle),
- Hide all windows (CMD + SHIFT + F12),
- Start editing.

If you want to create a new file and you need the project view, just do (CMD + 1) to open the project view to the folder
you want to add something to and do (CTRL + N) to create something new, like a file, package and so on.

If you need the project view, do (CMD + 1), navigate to the file, press (F4) to open the file in an editor and put the
focus on the editor; you can start editing. Close the project view using (CMD + 1) (or SHIFT + CMD + F12) to close all views.

If you know the file name you want to edit, do (DOUBLE SHIFT) and type the name of the file. Optionally use the (TAB)
key to jump through the search result sections and press (ENTER) to start editing the file.

If you already have edited a file, chances are that (SHIFT + CMD + E) or (CMD + E) already have the file in the history
so you can quickly select the file and start editing.

## Project Window
In the project window, enable the feature 'autoscroll from source', which is handy because the file that has the focus
of the editor will be selected by default when you open the project window. Click on the option icon in the project
view and select 'autoscroll from source'.

## Keymap changes
I changed some keymappings. You can change keymapping: (CMD + SHIFT + A -> keymap p), then search for the option and then remove the
key and set a new one if applicable.

- Implicit conversion. By default its (CTRL + Q) but I sometimes quit the IDE (CMD + Q) so I've changed it to (CTRL + I).

## Plugins
- Presentation Assistant: shows used keyboard shortcuts; great for pair programming or presentations
- [IntelliJDashPlugin](https://github.com/gdelmas/IntelliJDashPlugin): A smart and simple plugin that provides keyboard shortcut access for [Dash](https://kapeli.com/dash).

## Youtube
- [IDEA Tips and Tricks - Hadi Hariri](https://www.youtube.com/watch?v=bFcaO1pXzws)
