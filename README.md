1. **Автоматизация тестов dev-portal**
2. **Изменение стенда автоматизации**:
   1. Перейти в класс pages.BasePage
   2. Расскоментировать нужный baseUrl и закомментировать ненужный:
      1. Выделить строку(или просто навести курсор на нужную строку)
      2. Нажать сочетание клавиш Ctrl(command) + / для комментирования/расскомментирования
   3. Для прогона на DEV-стенде не забудьте включить VPN
3. **Изменение логики с загруженными файлами**
   1. Вызвать тестовый метод checkOpenAllPagesByURLsAndDownloadFiles
   2. Передать true аргументом в скобках, чтобы скачанные файлы удалались
   3. Либо false, чтобы файлы оставались в настроенной папке