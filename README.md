## Коротышки

Добро пожаловать в репозиторий объектной модели "Коротышки".

## Структура

В репозитории хранятся два пакета:

- `shortMen`: пакет с коротышками
- `Z.utils`: пакет с двумя классами с реализацией односвязного списка

> Пакет со списком хорошо показывает один из принципов ООП: инкапсулирование. Есть два класса, один из которых вызвать вне пакета невозможно.

## Описание модели "Коротышек"

Одним из главных классов является `Thing`, который позволяет создать объект, имеющий имя, положение в виде набора координат и способность перемещаться. 

От класса `Thing` наследуется `ShortMan`. Этот класс обладает `enum` свойствами, такими как:

- хитрость (`IsCunning`)
- здоровье (`IsHealthy`)

Хитрый или болеющий коротышка откажется перемещаться сам, но он может быть притянут другим коротышкой.

У коротышки есть возможность хвататься за любую другую сущность, будь то какая-то вещица или другой коротышка. При движении, коротышка утягивает все за собой. Разумеется, коротышка может расцепиться.

Второй важный класс - это `Space`, абстрактная модель пространства, которое хранит коротышек и позволяет им перемещаться. Через специальный интерфейс `Location` реализована возможность использования класса `Position` на любом классе пространства.

От абстрактного класса 'Space' унаследованы классы помещения и улицы. Помещение получает свой адрес, улица же позволяет генерировать открытый мир.

## Диаграмма модели

![Диаграмма классовой модели](https://raw.githubusercontent.com/username918r818/itmo_programming_lab_3/master/img/diagram.png)